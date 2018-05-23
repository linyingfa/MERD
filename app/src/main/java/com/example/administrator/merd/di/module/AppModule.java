package com.example.administrator.merd.di.module;


import com.example.administrator.merd.app.App;
import com.example.administrator.merd.model.DataManager;
import com.example.administrator.merd.model.db.DBHelper;
import com.example.administrator.merd.model.db.RealmHelper;
import com.example.administrator.merd.model.http.HttpHelper;
import com.example.administrator.merd.model.http.RetrofitHelper;
import com.example.administrator.merd.model.prefs.ImplPreferencesHelper;
import com.example.administrator.merd.model.prefs.PreferencesHelper;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by codeest on 16/8/7.
 */

@Module
public class AppModule {
    private final App application;

    public AppModule(App application) {
        this.application = application;
    }

    @Provides
    @Singleton
    App provideApplicationContext() {
        return application;
    }

    @Provides
    @Singleton
    HttpHelper provideHttpHelper(RetrofitHelper retrofitHelper) {
        return retrofitHelper;
    }

    @Provides
    @Singleton
    DBHelper provideDBHelper(RealmHelper realmHelper) {
        return realmHelper;
    }

    @Provides
    @Singleton
    PreferencesHelper providePreferencesHelper(ImplPreferencesHelper implPreferencesHelper) {
        return implPreferencesHelper;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(HttpHelper httpHelper, DBHelper DBHelper, PreferencesHelper preferencesHelper) {
        return new DataManager(httpHelper, DBHelper, preferencesHelper);
    }
}
