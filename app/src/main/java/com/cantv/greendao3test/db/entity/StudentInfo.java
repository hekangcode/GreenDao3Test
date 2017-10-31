package com.cantv.greendao3test.db.entity;

import com.cantv.greendao3test.db.dao.DaoSession;
import com.cantv.greendao3test.db.dao.StudentInfoDao;

import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;

/**
 * Created by HEKANG on 2016/12/15.
 */
@Entity(
        nameInDb = "student",
        active = true,
        createInDb = true
)
public class StudentInfo {

    @Id
    private Long _id;
    @NotNull
    private String name;
    private String unumber;
    private String city;

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 1942392019)
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.refresh(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 713229351)
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.update(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 128553479)
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.delete(this);
    }

    /**
     * called by internal mechanisms, do not call yourself.
     */
    @Generated(hash = 1653656253)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getStudentInfoDao() : null;
    }

    /**
     * Used for active entity operations.
     */
    @Generated(hash = 446949611)
    private transient StudentInfoDao myDao;
    /**
     * Used to resolve relations
     */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long get_id() {
        return this._id;
    }

    public void set_id(Long _id) {
        this._id = _id;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUnumber() {
        return this.unumber;
    }

    public void setUnumber(String unumber) {
        this.unumber = unumber;
    }

    @Generated(hash = 2074399777)
    public StudentInfo(Long _id, @NotNull String name, String unumber, String city) {
        this._id = _id;
        this.name = name;
        this.unumber = unumber;
        this.city = city;
    }

    @Generated(hash = 2016856731)
    public StudentInfo() {
    }
}
