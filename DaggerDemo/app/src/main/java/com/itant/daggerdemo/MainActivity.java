package com.itant.daggerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject User user;
    //@Inject IRequest iRequest;
    private TextView tv_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_test = findViewById(R.id.tv_test);

        DaggerMainComponent.builder().build().gogogo(this);
        tv_test.setText(user.getName());
        //tv_test.setText(user.getName());
    }
}
