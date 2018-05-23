package com.example.administrator.merd.base.contract.vtex;



import com.example.administrator.merd.base.BasePresenter;
import com.example.administrator.merd.base.BaseView;
import com.example.administrator.merd.model.bean.TopicListBean;

import java.util.List;

/**
 * Created by codeest on 16/12/23.
 */

public interface VtexContract {

    interface View extends BaseView {

        void showContent(List<TopicListBean> mList);

    }

    interface Presenter extends BasePresenter<View> {

        void getContent(String type);

    }
}
