package com.cc.mvp.model;

import com.cc.mvp.bean.UserBean;

/**
 * Created by Administrator on 2017/7/26.
 */

public class LoginModelImpl implements LoginModelIble {

    LoginModelListener mLoginModelListener;

    public LoginModelImpl(LoginModelListener mLoginModelListener) {
        this.mLoginModelListener = mLoginModelListener;
    }

    @Override
    public void login(UserBean mUserBean) {
        boolean islogin = false ;
        String name,pwd;
        name = mUserBean.getAccouts();
        pwd = mUserBean.getPwd();
        if("admin".equals(name)&&"123".equals(pwd)){
            islogin = true;
        }
        mLoginModelListener.loginStatus(islogin);

    }
}

