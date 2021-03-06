package com.example.administrator.merd.base.contract.vtex;


import com.example.administrator.merd.base.BasePresenter;
import com.example.administrator.merd.base.BaseView;
import com.example.administrator.merd.model.bean.NodeListBean;
import com.example.administrator.merd.model.bean.RealmLikeBean;
import com.example.administrator.merd.model.bean.RepliesListBean;

import java.util.List;

/**
 * Created by codeest on 16/12/23.
 */

public interface RepliesContract {

    interface View extends BaseView {

        void showContent(List<RepliesListBean> mList);

        void showTopInfo(NodeListBean mTopInfo);
    }

    interface Presenter extends BasePresenter<View> {

        void getContent(String topic_id);

        void getTopInfo(String topic_id);

        void insert(RealmLikeBean bean);

        void delete(String id);

        boolean query(String id);
    }
}
