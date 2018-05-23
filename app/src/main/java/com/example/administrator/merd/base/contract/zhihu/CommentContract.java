package com.example.administrator.merd.base.contract.zhihu;


import com.example.administrator.merd.base.BasePresenter;
import com.example.administrator.merd.base.BaseView;
import com.example.administrator.merd.model.bean.CommentBean;

/**
 * Created by codeest on 16/8/18.
 */

public interface CommentContract {

    interface View extends BaseView {

        void showContent(CommentBean commentBean);

    }

    interface Presenter extends BasePresenter<View> {

        void getCommentData(int id, int commentKind);

    }
}
