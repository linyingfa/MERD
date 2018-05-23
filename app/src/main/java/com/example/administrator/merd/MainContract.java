package com.example.administrator.merd;

import com.example.administrator.merd.base.BasePresenter;
import com.example.administrator.merd.base.BaseView;
import com.example.administrator.merd.model.bean.WelcomeBean;

/**
 * Created by xiaolin on 2018/5/23.
 */
public interface MainContract {
	interface View extends BaseView {
		void showContent(WelcomeBean welcomeBean);

		void jumpToMain();
	}

	interface Presenter extends BasePresenter<View> {
		void getWelcomeData();
	}
}
