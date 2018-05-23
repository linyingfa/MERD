package com.example.administrator.merd;

import com.example.administrator.merd.base.RxPresenter;
import com.example.administrator.merd.model.DataManager;
import com.example.administrator.merd.model.bean.WelcomeBean;
import com.example.administrator.merd.util.RxUtil;

import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import io.reactivex.Flowable;
import io.reactivex.functions.Consumer;

/**
 * Created by xiaolin on 2018/5/23.
 */
public class MainPresenter extends RxPresenter<MainContract.View> implements MainContract.Presenter {
	private static final String RES = "1080*1776";
	private static final int COUNT_DOWN_TIME = 2200;
	//
	private DataManager mDataManager;

	@Inject
	public MainPresenter(DataManager mDataManager) {
		this.mDataManager = mDataManager;
	}

	@Override
	public void getWelcomeData() {
		addSubscribe(mDataManager.fetchWelcomeInfo(RES)
				.compose(RxUtil.<WelcomeBean>rxSchedulerHelper())
				.subscribe(new Consumer<WelcomeBean>() {
					@Override
					public void accept(WelcomeBean welcomeBean) {
						mView.showContent(welcomeBean);
					}
				}, new Consumer<Throwable>() {
					@Override
					public void accept(Throwable throwable) {
						mView.jumpToMain();
					}
				})
		);
	}

	private void startCountDown() {
		addSubscribe(Flowable.timer(COUNT_DOWN_TIME, TimeUnit.MILLISECONDS)
				.compose(RxUtil.<Long>rxSchedulerHelper())
				.subscribe(new Consumer<Long>() {
					@Override
					public void accept(Long aLong) {
						mView.jumpToMain();
					}
				})
		);
	}
}
