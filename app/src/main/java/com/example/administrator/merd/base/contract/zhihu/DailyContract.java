package com.example.administrator.merd.base.contract.zhihu;


import com.example.administrator.merd.base.BasePresenter;
import com.example.administrator.merd.base.BaseView;
import com.example.administrator.merd.model.bean.DailyBeforeListBean;
import com.example.administrator.merd.model.bean.DailyListBean;

/**
 * Created by codeest on 16/8/11.
 */

public interface DailyContract {

    interface View extends BaseView {

        void showContent(DailyListBean info);

        void showMoreContent(String date, DailyBeforeListBean info);

        void doInterval(int currentCount);
    }

    interface Presenter extends BasePresenter<View> {

        void getDailyData();

        void getBeforeData(String date);

        void startInterval();

        void stopInterval();

        void insertReadToDB(int id);
    }
}
