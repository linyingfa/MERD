package com.example.administrator.merd.base.contract.zhihu;

import com.example.administrator.merd.base.BasePresenter;
import com.example.administrator.merd.base.BaseView;
import com.example.administrator.merd.model.bean.ThemeChildListBean;

/**
 * Created by codeest on 16/8/24.
 */

public interface ThemeChildContract {

    interface View extends BaseView {

        void showContent(ThemeChildListBean themeChildListBean);

    }

    interface Presenter extends BasePresenter<View> {

        void getThemeChildData(int id);

        void insertReadToDB(int id);
    }
}
