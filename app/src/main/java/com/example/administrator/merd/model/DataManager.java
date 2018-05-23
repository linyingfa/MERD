package com.example.administrator.merd.model;

import com.example.administrator.merd.model.db.DBHelper;
import com.example.administrator.merd.model.http.HttpHelper;
import com.example.administrator.merd.model.prefs.PreferencesHelper;

/**
 * Created by Administrator on 2018/5/23.
 */

public class DataManager implements HttpHelper, DBHelper, PreferencesHelper {

    HttpHelper mHttpHelper;
    DBHelper mDbHelper;
    PreferencesHelper mPreferencesHelper;

    public DataManager(HttpHelper httpHelper, DBHelper dbHelper, PreferencesHelper preferencesHelper) {
        mHttpHelper = httpHelper;
        mDbHelper = dbHelper;
        mPreferencesHelper = preferencesHelper;
    }

    @Override
    public boolean getNightModeState() {
        return mPreferencesHelper.getNightModeState();
    }

    @Override
    public void setNightModeState(boolean state) {

    }

    @Override
    public boolean getNoImageState() {
        return false;
    }

    @Override
    public void setNoImageState(boolean state) {

    }

    @Override
    public boolean getAutoCacheState() {
        return false;
    }

    @Override
    public void setAutoCacheState(boolean state) {

    }

    @Override
    public int getCurrentItem() {
        return 0;
    }

    @Override
    public void setCurrentItem(int item) {

    }

    @Override
    public boolean getLikePoint() {
        return false;
    }

    @Override
    public void setLikePoint(boolean isFirst) {

    }

    @Override
    public boolean getVersionPoint() {
        return false;
    }

    @Override
    public void setVersionPoint(boolean isFirst) {

    }

    @Override
    public boolean getManagerPoint() {
        return false;
    }

    @Override
    public void setManagerPoint(boolean isFirst) {

    }
}
