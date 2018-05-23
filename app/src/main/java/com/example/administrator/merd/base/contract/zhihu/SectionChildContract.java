package com.example.administrator.merd.base.contract.zhihu;


import com.example.administrator.merd.base.BasePresenter;
import com.example.administrator.merd.base.BaseView;
import com.example.administrator.merd.model.bean.SectionChildListBean;

/**
 * Created by codeest on 16/8/28.
 */

public interface SectionChildContract {

    interface View extends BaseView {

        void showContent(SectionChildListBean sectionChildListBean);
    }

    interface Presenter extends BasePresenter<View> {

        void getThemeChildData(int id);

        void insertReadToDB(int id);
    }
}
