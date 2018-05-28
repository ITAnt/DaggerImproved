package com.itant.daggerandroid.main;

import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.widget.TextView;

import com.itant.daggerandroid.R;
import com.itant.daggerandroid.base.BaseActivity;
import com.itant.daggerandroid.bean.Student;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {
    @Inject
    String className;
    @Inject
    SharedPreferences sp;

    @Inject
    MainPresenter presenter;
    @Inject
    Student student;

    private TextView tv_test;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_test = findViewById(R.id.tv_test);

        //下面这行代码把所有实例化的对象展示在界面中
        tv_test.setText(className + "\n" +
                sp.toString() + "\n" +
                presenter.toString() + "\n" +
                student.toString());
    }
}