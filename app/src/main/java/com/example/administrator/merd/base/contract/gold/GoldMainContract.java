package com.example.administrator.merd.base.contract.gold;


import com.example.administrator.merd.base.BasePresenter;
import com.example.administrator.merd.base.BaseView;
import com.example.administrator.merd.model.bean.GoldManagerBean;
import com.example.administrator.merd.model.bean.GoldManagerItemBean;

import java.util.List;

/**
 * Created by codeest on 16/11/28.
 */

public interface GoldMainContract {

    interface View extends BaseView {

        void updateTab(List<GoldManagerItemBean> mList);

        void jumpToManager(GoldManagerBean mBean);
    }

    interface Presenter extends BasePresenter<View> {

        void initManagerList();

        void setManagerList();
    }
}
