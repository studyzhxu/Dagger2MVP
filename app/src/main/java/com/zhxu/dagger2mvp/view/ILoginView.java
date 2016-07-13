package com.zhxu.dagger2mvp.view;

/**
 * Created by xz on 2016/7/12.
 */
public interface ILoginView {

    public void onClearText();
    public void onLoginResult(Boolean result, int code);
    public void onSetProgressBarVisibility(int visibility);
}
