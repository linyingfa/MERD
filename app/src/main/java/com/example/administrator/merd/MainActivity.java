package com.example.administrator.merd;


import com.example.administrator.merd.base.BaseActivity;
import com.example.administrator.merd.model.bean.WelcomeBean;
import com.example.administrator.merd.util.ToastUtil;

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View {
	@Override
	protected int getLayout() {
		return R.layout.activity_main;
	}

	@Override
	protected void initEventAndData() {
		mPresenter.getWelcomeData();
	}

	@Override
	protected void initInject() {
		getActivityComponent().inject(this);
	}

	@Override
	public void showContent(WelcomeBean welcomeBean) {
		ToastUtil.shortShow(welcomeBean.getText());
	}

	@Override
	public void jumpToMain() {
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
	}
}
