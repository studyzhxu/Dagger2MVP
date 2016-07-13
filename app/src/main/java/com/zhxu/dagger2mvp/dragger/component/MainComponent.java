package com.zhxu.dagger2mvp.dragger.component;


import com.zhxu.dagger2mvp.dragger.module.MainModule;
import com.zhxu.dagger2mvp.view.LoginActivity;

import dagger.Component;

/**
 * Created by xz on 2016/7/13.
 */

@Component(modules = MainModule.class)
public interface MainComponent {
    public void inject(LoginActivity activity) ;
}
