package com.example.administrator.merd.base.contract.zhihu;


import com.example.administrator.merd.base.BasePresenter;
import com.example.administrator.merd.base.BaseView;
import com.example.administrator.merd.model.bean.ThemeListBean;

/**
 * Created by codeest on 16/8/12.
 */

public interface ThemeContract {

    interface View extends BaseView {

        void showContent(ThemeListBean themeListBean);
    }

    interface Presenter extends BasePresenter<View> {

        void getThemeData();
    }
}
