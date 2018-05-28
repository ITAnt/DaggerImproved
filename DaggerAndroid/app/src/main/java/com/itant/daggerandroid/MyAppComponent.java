package com.itant.daggerandroid;

import com.itant.daggerandroid.main.MainActivityModule;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {
        AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
        MainActivityModule.class
})
public interface MyAppComponent {

   void inject(MyApplication application);
}