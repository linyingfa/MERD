package com.example.administrator.merd.di.component;


import com.example.administrator.merd.app.App;
import com.example.administrator.merd.di.module.AppModule;
import com.example.administrator.merd.di.module.HttpModule;
import com.example.administrator.merd.model.DataManager;
import com.example.administrator.merd.model.db.RealmHelper;
import com.example.administrator.merd.model.http.RetrofitHelper;
import com.example.administrator.merd.model.prefs.ImplPreferencesHelper;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by codeest on 16/8/7.
 */

@Singleton
@Component(modules = {AppModule.class, HttpModule.class})
public interface AppComponent {

    App getContext();  // 提供App的Context

    DataManager getDataManager(); //数据中心

    RetrofitHelper retrofitHelper();  //提供http的帮助类

    RealmHelper realmHelper();    //提供数据库帮助类

    ImplPreferencesHelper preferencesHelper(); //提供sp帮助类
}
