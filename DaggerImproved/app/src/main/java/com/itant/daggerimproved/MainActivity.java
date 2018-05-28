package com.itant.daggerimproved;

import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {

    @Inject
    String test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv_test = findViewById(R.id.tv_test);
        tv_test.setText(test);
    }
}
