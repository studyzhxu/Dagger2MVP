package com.zhxu.dagger2mvp.presenter;


import com.zhxu.dagger2mvp.model.User;
import com.zhxu.dagger2mvp.view.ILoginView;

import javax.inject.Inject;

/**
 * Created by xz on 2016/7/12.
 */
public class LoginPresenterCompl implements ILoginPresenter {

    private ILoginView loginView ;
    private User user ;

    @Inject
    public LoginPresenterCompl(ILoginView view){
        loginView = view ;
        user = new User("张三","123456") ;
    }

    @Override
    public void clear() {
        loginView.onClearText();
    }

    @Override
    public void doLogin(String name, String password) {
        boolean result = false ;
        int code = 0 ;
        if(name.equals(user.getName()) && password.equals(user.getPassword())){
            result = true ;
            code = 1 ;
        }else{
            result = false ;
            code = 0 ;
        }

        loginView.onLoginResult(result,code);
    }
}
