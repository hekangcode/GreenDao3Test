package com.cantv.greendao3test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.cantv.greendao3test.db.entity.StudentInfo;
import com.cantv.greendao3test.db.entity.TeacherInfo;
import com.cantv.greendao3test.manager.StudentManager;
import com.cantv.greendao3test.manager.TeacherManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private StudentManager studentManager;
    private TeacherManager teacherManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        studentManager = new StudentManager(this);
        teacherManager = new TeacherManager(this);
        Button btnInsertData = (Button)findViewById(R.id.btn_insert_student_data);
        btnInsertData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insert();
            }
        });
        Button btnteacher = (Button)findViewById(R.id.btn_insert_teacher_data);
        btnteacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insertTea();
            }
        });
    }

    private void insert(){
        List<StudentInfo> list = new ArrayList<>();
        for (int i = 0 ; i < 5 ; i ++){
            StudentInfo student = new StudentInfo();
            student.setName("小明");
            //student.setAge(12);
            student.setCity("北京");
            student.setUnumber("11111111");
            list.add(student);
        }
        studentManager.insert(list);
    }

    private void insertTea(){
        List<TeacherInfo> list = new ArrayList<>();
        for (int i = 0 ; i < 5 ; i ++){
            TeacherInfo teacher = new TeacherInfo();
            teacher.setName("aaaa");
            teacher.setAge(20);
            list.add(teacher);
        }
        teacherManager.insert(list);
    }
}
