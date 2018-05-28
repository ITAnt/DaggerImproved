package com.itant.daggerimproved;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * 新建AllActivityModule，统一管理，这样，我们每次新建一个Activity，只需要统一在这里新建2行代码声明对应的Activity即可。
 */
@Module(subcomponents = {
        BaseActivityComponent.class
})
public abstract class AllActivitysModule {

    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity contributeMainActivitytInjector();

//    @ContributesAndroidInjector(modules = SecondActivityModule.class)
//    abstract SecondActivity contributeSecondActivityInjector();

}