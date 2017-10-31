package com.cantv.greendao3test.db.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by HEKANG on 2016/12/16.
 */
@Entity(
        nameInDb = "teacher"
)
public class TeacherInfo {

    @Id
    private Long _id;
    private String name;
    private int age;
    private String city;
public int getAge() {
        return this.age;
}
public void setAge(int age) {
        this.age = age;
}
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
@Generated(hash = 991420922)
public TeacherInfo(Long _id, String name, int age, String city) {
        this._id = _id;
        this.name = name;
        this.age = age;
        this.city = city;
}
@Generated(hash = 1315226039)
public TeacherInfo() {
}
}
