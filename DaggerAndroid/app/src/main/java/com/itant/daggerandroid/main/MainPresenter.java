package com.itant.daggerandroid.main;

import javax.inject.Inject;

public class MainPresenter {

    private final MainActivity view;

    @Inject
    public MainPresenter(MainActivity view) {
        System.out.println("Presenter被初始化");
        this.view = view;
    }
}