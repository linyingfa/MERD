package com.example.administrator.merd.model.db;


import com.example.administrator.merd.model.bean.GoldManagerBean;

import javax.inject.Inject;

import io.realm.Realm;
import io.realm.RealmConfiguration;


/**
 * Created by codeest on 16/8/16.
 */

public class RealmHelper implements DBHelper {

    private static final String DB_NAME = "myRealm.realm";

    private Realm mRealm;

    @Inject
    public RealmHelper() {
        mRealm = Realm.getInstance(new RealmConfiguration.Builder()
                .deleteRealmIfMigrationNeeded()
                .name(DB_NAME)
                .build());
    }


    /**
     * 获取 掘金首页管理列表
     * @return
     */
//    @Override
//    public GoldManagerBean getGoldManagerList() {
//        GoldManagerBean bean = mRealm.where(GoldManagerBean.class).findFirst();
//        if (bean == null)
//            return null;
//        return mRealm.copyFromRealm(bean);
//    }
}
