package com.itant.daggerandroid.main;

import android.content.Context;
import android.content.SharedPreferences;

import com.itant.daggerandroid.bean.Student;

import dagger.Module;
import dagger.Provides;
import dagger.Subcomponent;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

@Subcomponent(modules = {
        AndroidInjectionModule.class,
        MainActivitySubComponent.SubModule.class
})
public interface MainActivitySubComponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {
    }

    @Module
    class SubModule {

        @Provides
        String provideName() {
            return "我是MainActivity的类名";
        }

        @Provides
        SharedPreferences provideSp(MainActivity activity) {
            return activity.getSharedPreferences("def", Context.MODE_PRIVATE);
        }

        @Provides
        Student provideStudent() {
            return new Student();
        }
    }
}