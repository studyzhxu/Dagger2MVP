package com.zhxu.dagger2mvp.dragger.module;


import com.zhxu.dagger2mvp.view.ILoginView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by xz on 2016/7/13.
 */

@Module
public class MainModule {

    private final ILoginView view ;
    private int count ;

    public MainModule(ILoginView view,int count ){
        this.view = view ;
        this.count = count ;

        
    }

    @Provides
    ILoginView provideILogView(){
        return view ;
    }

    @Provides
    int provideInt(){
        return count ;
    }
}
