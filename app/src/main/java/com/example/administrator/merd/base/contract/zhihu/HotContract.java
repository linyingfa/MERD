package com.example.administrator.merd.base.contract.zhihu;


import com.example.administrator.merd.base.BasePresenter;
import com.example.administrator.merd.base.BaseView;
import com.example.administrator.merd.model.bean.HotListBean;

/**
 * Created by codeest on 16/8/12.
 */

public interface HotContract {

    interface View extends BaseView {

        void showContent(HotListBean hotListBean);
    }

    interface Presenter extends BasePresenter<View> {

        void getHotData();

        void insertReadToDB(int id);

    }
}
