package com.example.administrator.merd.model.http;

import com.example.administrator.merd.model.http.api.GankApis;
import com.example.administrator.merd.model.http.api.GoldApis;
import com.example.administrator.merd.model.http.api.MyApis;
import com.example.administrator.merd.model.http.api.VtexApis;
import com.example.administrator.merd.model.http.api.WeChatApis;
import com.example.administrator.merd.model.http.api.ZhihuApis;

import javax.inject.Inject;

/**
 * Created by Administrator on 2018/5/23.
 */

public class RetrofitHelper implements HttpHelper {

    private ZhihuApis mZhihuApiService;
    private GankApis mGankApiService;
    private WeChatApis mWechatApiService;
    private MyApis mMyApiService;
    private GoldApis mGoldApiService;
    private VtexApis mVtexApiService;

    @Inject
    public RetrofitHelper(ZhihuApis zhihuApiService, GankApis gankApiService, WeChatApis wechatApiService,
                          MyApis myApiService, GoldApis goldApiService, VtexApis vtexApiService) {
        this.mZhihuApiService = zhihuApiService;
        this.mGankApiService = gankApiService;
        this.mWechatApiService = wechatApiService;
        this.mMyApiService = myApiService;
        this.mGoldApiService = goldApiService;
        this.mVtexApiService = vtexApiService;
    }
}
