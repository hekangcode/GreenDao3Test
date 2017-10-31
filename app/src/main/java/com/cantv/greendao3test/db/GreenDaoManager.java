package com.cantv.greendao3test.db;

import android.content.Context;

import com.cantv.greendao3test.db.upgrade.OnUpgradeHelper;

/**
 * Created by HEKANG on 2016/12/15.
 */

public class GreenDaoManager {

    private final String DB_NAME = "GreenDaoTest.db";
    //public DaoMaster.DevOpenHelper openHelper;
    public OnUpgradeHelper openHelper;
    private static volatile GreenDaoManager mInstance;

    private GreenDaoManager(Context context) {
        //openHelper = new DaoMaster.DevOpenHelper(context , DB_NAME , null);
        openHelper = new OnUpgradeHelper(context, DB_NAME, null);
    }

    /**
     * 获取单例引用
     */
    public static GreenDaoManager getInstance(Context context) {
        if (mInstance == null) {
            synchronized (GreenDaoManager.class) {
                if (mInstance == null) {
                    mInstance = new GreenDaoManager(context.getApplicationContext());
                }
            }
        }
        return mInstance;
    }
}
