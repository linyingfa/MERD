package com.example.administrator.merd.base.contract.wechat;



import com.example.administrator.merd.base.BasePresenter;
import com.example.administrator.merd.base.BaseView;
import com.example.administrator.merd.model.bean.WXItemBean;

import java.util.List;

/**
 * Created by codeest on 16/8/29.
 */

public interface WechatContract {

    interface View extends BaseView {

        void showContent(List<WXItemBean> mList);

        void showMoreContent(List<WXItemBean> mList);
    }

    interface Presenter extends BasePresenter<View> {

        void getWechatData();

        void getMoreWechatData();
    }
}
