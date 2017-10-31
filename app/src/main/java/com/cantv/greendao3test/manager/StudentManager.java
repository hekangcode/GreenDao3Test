package com.cantv.greendao3test.manager;

import android.content.Context;

import com.cantv.greendao3test.db.GreenDaoManager;
import com.cantv.greendao3test.db.dao.DaoMaster;
import com.cantv.greendao3test.db.dao.StudentInfoDao;
import com.cantv.greendao3test.db.entity.StudentInfo;

import java.util.List;

/**
 * Created by HEKANG on 2016/12/15.
 */

public class StudentManager {

    private StudentInfoDao studao;

    public  StudentManager(Context context){
        studao = new DaoMaster(GreenDaoManager.getInstance(context).openHelper.getWritableDatabase()).newSession().getStudentInfoDao();
    }

    public void insert(List<StudentInfo> list){
        studao.insertInTx(list);
    }
}
