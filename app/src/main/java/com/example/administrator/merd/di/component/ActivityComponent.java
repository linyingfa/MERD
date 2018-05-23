package com.example.administrator.merd.di.component;

import android.app.Activity;


import com.example.administrator.merd.MainActivity;
import com.example.administrator.merd.di.module.ActivityModule;
import com.example.administrator.merd.di.scope.ActivityScope;

import dagger.Component;

/**
 * Created by codeest on 16/8/7.
 */

@ActivityScope
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    Activity getActivity();

//    void inject(WelcomeActivity welcomeActivity);

    void inject(MainActivity mainActivity);

//    void inject(ZhihuDetailActivity zhihuDetailActivity);
//
//    void inject(ThemeActivity themeActivity);
//
//    void inject(SectionActivity sectionActivity);
//
//    void inject(RepliesActivity repliesActivity);
//
//    void inject(NodeListActivity nodeListActivity);
}
