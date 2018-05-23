package com.example.administrator.merd.model;

import com.example.administrator.merd.model.bean.WelcomeBean;
import com.example.administrator.merd.model.db.DBHelper;
import com.example.administrator.merd.model.http.HttpHelper;
import com.example.administrator.merd.model.prefs.PreferencesHelper;

import io.reactivex.Flowable;

/**
 * Created by Administrator on 2018/5/23.
 * , PreferencesHelper
 */
public class DataManager implements HttpHelper, DBHelper {
	HttpHelper mHttpHelper;
	DBHelper mDbHelper;
	PreferencesHelper mPreferencesHelper;

	public DataManager(HttpHelper httpHelper, DBHelper dbHelper, PreferencesHelper preferencesHelper) {
		mHttpHelper = httpHelper;
		mDbHelper = dbHelper;
		mPreferencesHelper = preferencesHelper;
	}

	@Override
	public Flowable<WelcomeBean> fetchWelcomeInfo(String res) {
		return mHttpHelper.fetchWelcomeInfo(res);
	}
}
