package com.cc.mvp.presenter;

import com.cc.mvp.bean.UserBean;
import com.cc.mvp.model.LoginModelIble;
import com.cc.mvp.model.LoginModelImpl;
import com.cc.mvp.model.LoginModelListener;
import com.cc.mvp.view.LoginViewIble;

/**
 * Created by Administrator on 2017/7/26.
 */

public class LoginPresenterImpl implements LoginPresenterIble,LoginModelListener{

    LoginViewIble mLoginViewIble;
    LoginModelIble mLoginModelIble;
    UserBean mUserBean;



    public LoginPresenterImpl(LoginViewIble mLoginViewIble) {
        this.mLoginViewIble = mLoginViewIble;
        mLoginModelIble = new LoginModelImpl(this);
    }

    @Override
    public void login() {
        mUserBean = new UserBean();
        mUserBean.setAccouts(mLoginViewIble.getAccount());
        mUserBean.setPwd(mLoginViewIble.getPwd());
        mLoginModelIble.login(mUserBean);
    }

    @Override
    public void exit() {
        mLoginViewIble.clear();
        mLoginViewIble.showMsg("退出登录");
    }

    @Override
    public void loginStatus(boolean status) {
        String msg;
        if(status){
            msg = "登录成功";
        }
        else {
            msg = "帐号或密码错误";
        }
        mLoginViewIble.showMsg(msg);
    }
}
