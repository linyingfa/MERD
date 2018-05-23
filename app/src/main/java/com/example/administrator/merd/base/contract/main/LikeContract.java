package com.example.administrator.merd.base.contract.main;


import com.example.administrator.merd.base.BasePresenter;
import com.example.administrator.merd.base.BaseView;
import com.example.administrator.merd.model.bean.RealmLikeBean;

import java.util.List;

/**
 * Created by codeest on 2016/8/23.
 */
public interface LikeContract {

    interface View extends BaseView {

        void showContent(List<RealmLikeBean> mList);
    }

    interface Presenter extends BasePresenter<View> {

        void getLikeData();

        void deleteLikeData(String id);

        void changeLikeTime(String id, long time, boolean isPlus);

        boolean getLikePoint();

        void setLikePoint(boolean b);
    }
}
