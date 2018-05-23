package com.example.administrator.merd.base.contract.main;


import com.example.administrator.merd.base.BasePresenter;
import com.example.administrator.merd.base.BaseView;
import com.example.administrator.merd.model.bean.VersionBean;

/**
 * Created by codeest on 16/10/17.
 */

public interface SettingContract {

    interface View extends BaseView {

        void showUpdateDialog(VersionBean bean);

    }

    interface Presenter extends BasePresenter<View> {

        void checkVersion(String currentVersion);

        void setNightModeState(boolean b);

        void setNoImageState(boolean b);

        void setAutoCacheState(boolean b);

        boolean getNightModeState();

        boolean getNoImageState();

        boolean getAutoCacheState();
    }
}
