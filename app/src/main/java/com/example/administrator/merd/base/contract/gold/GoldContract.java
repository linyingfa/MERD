package com.example.administrator.merd.base.contract.gold;


import com.example.administrator.merd.base.BasePresenter;
import com.example.administrator.merd.base.BaseView;
import com.example.administrator.merd.model.bean.GoldListBean;

import java.util.List;

/**
 * Created by codeest on 16/11/27.
 */

public interface GoldContract {

    interface View extends BaseView {

        void showContent(List<GoldListBean> goldListBean);

        void showMoreContent(List<GoldListBean> goldMoreListBean, int start, int end);
    }

    interface Presenter extends BasePresenter<View> {

        void getGoldData(String type);

        void getMoreGoldData();
    }
}
