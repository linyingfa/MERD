package com.example.administrator.merd.base.contract.gank;


import com.example.administrator.merd.base.BasePresenter;
import com.example.administrator.merd.base.BaseView;
import com.example.administrator.merd.model.bean.GankItemBean;

import java.util.List;

/**
 * Created by codeest on 16/8/19.
 */

public interface GirlContract {

    interface View extends BaseView {

        void showContent(List<GankItemBean> list);

        void showMoreContent(List<GankItemBean> list);
    }

    interface Presenter extends BasePresenter<View> {

        void getGirlData();

        void getMoreGirlData();

    }
}
