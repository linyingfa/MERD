package com.example.administrator.merd.base.contract.main;


import com.example.administrator.merd.base.BasePresenter;
import com.example.administrator.merd.base.BaseView;
import com.example.administrator.merd.model.bean.WelcomeBean;

/**
 * Created by codeest on 16/8/15.
 */

public interface WelcomeContract {

    interface View extends BaseView {

        void showContent(WelcomeBean welcomeBean);

        void jumpToMain();

    }

    interface Presenter extends BasePresenter<View> {

        void getWelcomeData();

    }
}
