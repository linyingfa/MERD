package com.example.administrator.merd.base;

import android.support.v7.app.AppCompatDelegate;
import android.view.ViewGroup;

import com.example.administrator.merd.app.App;
import com.example.administrator.merd.di.component.ActivityComponent;
import com.example.administrator.merd.di.component.DaggerActivityComponent;
import com.example.administrator.merd.di.module.ActivityModule;
import com.example.administrator.merd.util.SnackbarUtil;

import javax.inject.Inject;

/**
 * MVP activity基类
 */
public abstract class BaseActivity<T extends BasePresenter> extends SimpleActivity implements BaseView {
	//抽象类不能实例化，那个类实例化了那么这个变量就是属于那个类
	//这个是简单的注入，主要有注射器，就可以通过@Inject来创建对象
	@Inject
	protected T mPresenter;

	protected ActivityComponent getActivityComponent() {
		return DaggerActivityComponent.builder()
				.appComponent(App.getAppComponent())
				.activityModule(getActivityModule())
				.build();
	}

	protected ActivityModule getActivityModule() {
		return new ActivityModule(this);
	}

	@Override
	protected void onViewCreated() {
		super.onViewCreated();
		initInject();
		if (mPresenter != null)
			mPresenter.attachView(this);
	}

	@Override
	protected void onDestroy() {
		if (mPresenter != null)
			mPresenter.detachView();
		super.onDestroy();
	}

	@Override
	public void showErrorMsg(String msg) {
		SnackbarUtil.show(((ViewGroup) findViewById(android.R.id.content)).getChildAt(0), msg);
	}

	@Override
	public void useNightMode(boolean isNight) {
		if (isNight) {
			AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
		} else {
			AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
		}
		recreate();
	}

	@Override
	public void stateError() {
	}

	@Override
	public void stateEmpty() {
	}

	@Override
	public void stateLoading() {
	}

	@Override
	public void stateMain() {
	}

	protected abstract void initInject();
}