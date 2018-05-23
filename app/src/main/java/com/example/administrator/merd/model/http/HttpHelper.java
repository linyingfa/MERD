package com.example.administrator.merd.model.http;

import com.example.administrator.merd.model.bean.WelcomeBean;

import io.reactivex.Flowable;

/**
 * Created by Administrator on 2018/5/23.
 */
public interface HttpHelper {
	Flowable<WelcomeBean> fetchWelcomeInfo(String res);
}
