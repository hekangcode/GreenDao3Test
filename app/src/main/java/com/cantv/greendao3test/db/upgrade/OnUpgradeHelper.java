package com.cantv.greendao3test.db.upgrade;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.cantv.greendao3test.db.dao.DaoMaster;
import com.cantv.greendao3test.db.dao.StudentInfoDao;
import com.cantv.greendao3test.db.dao.TeacherInfoDao;

import org.greenrobot.greendao.database.Database;

/**
 * Created by HEKANG on 2016/12/15.
 * 数据库升级帮助类
 */

public class OnUpgradeHelper extends DaoMaster.OpenHelper{

    public OnUpgradeHelper(Context context, String name , SQLiteDatabase.CursorFactory factory){
        super(context , name , factory);
    }

    @Override
    public void onUpgrade(Database db, int oldVersion, int newVersion) {
        CopyDataHelper.migrate(db , StudentInfoDao.class , TeacherInfoDao.class);
    }
}
