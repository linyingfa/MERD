package com.example.administrator.merd.base.contract.gank;


import com.example.administrator.merd.base.BasePresenter;
import com.example.administrator.merd.base.BaseView;
import com.example.administrator.merd.model.bean.GankItemBean;

import java.util.List;

/**
 * Created by codeest on 16/8/20.
 */

public interface TechContract {

    interface View extends BaseView {

        void showContent(List<GankItemBean> mList);

        void showMoreContent(List<GankItemBean> mList);

        void showGirlImage(String url, String copyright);
    }

    interface Presenter extends BasePresenter<View> {

        void getGankData(String tech, int type);

        void getMoreGankData(String tech);

        void getGirlImage();

    }
}
