package com.cantv.greendao3test.db.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.cantv.greendao3test.db.entity.StudentInfo;
import com.cantv.greendao3test.db.entity.TeacherInfo;

import com.cantv.greendao3test.db.dao.StudentInfoDao;
import com.cantv.greendao3test.db.dao.TeacherInfoDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig studentInfoDaoConfig;
    private final DaoConfig teacherInfoDaoConfig;

    private final StudentInfoDao studentInfoDao;
    private final TeacherInfoDao teacherInfoDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        studentInfoDaoConfig = daoConfigMap.get(StudentInfoDao.class).clone();
        studentInfoDaoConfig.initIdentityScope(type);

        teacherInfoDaoConfig = daoConfigMap.get(TeacherInfoDao.class).clone();
        teacherInfoDaoConfig.initIdentityScope(type);

        studentInfoDao = new StudentInfoDao(studentInfoDaoConfig, this);
        teacherInfoDao = new TeacherInfoDao(teacherInfoDaoConfig, this);

        registerDao(StudentInfo.class, studentInfoDao);
        registerDao(TeacherInfo.class, teacherInfoDao);
    }
    
    public void clear() {
        studentInfoDaoConfig.getIdentityScope().clear();
        teacherInfoDaoConfig.getIdentityScope().clear();
    }

    public StudentInfoDao getStudentInfoDao() {
        return studentInfoDao;
    }

    public TeacherInfoDao getTeacherInfoDao() {
        return teacherInfoDao;
    }

}
