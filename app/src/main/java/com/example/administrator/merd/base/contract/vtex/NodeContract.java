package com.example.administrator.merd.base.contract.vtex;



import com.example.administrator.merd.base.BasePresenter;
import com.example.administrator.merd.base.BaseView;
import com.example.administrator.merd.model.bean.NodeBean;
import com.example.administrator.merd.model.bean.NodeListBean;

import java.util.List;

/**
 * Created by codeest on 16/12/23.
 */

public interface NodeContract {

    interface View extends BaseView {

        void showContent(List<NodeListBean> mList);

        void showTopInfo(NodeBean mTopInfo);
    }

    interface Presenter extends BasePresenter<View> {

        void getContent(String node_name);

        void getTopInfo(String node_name);
    }
}
