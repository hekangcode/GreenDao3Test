package com.cantv.greendao3test.manager;

import android.content.Context;

import com.cantv.greendao3test.db.GreenDaoManager;
import com.cantv.greendao3test.db.dao.DaoMaster;
import com.cantv.greendao3test.db.dao.TeacherInfoDao;
import com.cantv.greendao3test.db.entity.TeacherInfo;

import java.util.List;

/**
 * Created by HEKANG on 2016/12/16.
 */

public class TeacherManager {

    private TeacherInfoDao taedao;

    public  TeacherManager(Context context){
        taedao = new DaoMaster(GreenDaoManager.getInstance(context).openHelper.getWritableDatabase()).newSession().getTeacherInfoDao();
    }

    public void insert(List<TeacherInfo> list){
        taedao.insertInTx(list);
    }
}
