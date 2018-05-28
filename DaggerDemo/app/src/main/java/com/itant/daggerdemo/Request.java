package com.itant.daggerdemo;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by zWX570349 on 2018/5/25.
 */

@Singleton
public class Request implements IRequest {

    private String url = "www.baidu.com";

    @Inject
    public Request() {
        url = "www.sina.com";
    }

    @Override
    public int getContent() {
        return 6;
    }
}