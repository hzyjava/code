package cn.jesse.mvp.presenter;

import cn.jesse.mvp.bean.UserBean;
import cn.jesse.mvp.model.UserModellble;
import cn.jesse.mvp.model.UserModelImpl;
import cn.jesse.mvp.listener.OnLoginListenerlble;
import cn.jesse.mvp.view.LoginViewlble;

/**
 * Created by jesse on 15-6-24.
 */
public class LoginPresenterImpl implements LoginPresenterlble, OnLoginListenerlble{
    private UserModellble userBiz;//model
    private LoginViewlble loginView;//view  在activity中实现view相关方法 获取用户名，密码

    public LoginPresenterImpl(LoginViewlble loginView){
        this.loginView = loginView;
        userBiz = new UserModelImpl(this);
    }

    @Override
    public void login() {
        UserBean login = new UserBean();
        login.setUsername(loginView.getUsername());
        login.setPassword(loginView.getPassword());
        userBiz.login(login);
    }

    @Override
    public void clear() {
        loginView.clearPassword();
        loginView.clearUsername();
    }

    @Override
    public void loginStatus(boolean status) {
        String msg;
        if (status)
            msg = "login succeed";
        else
            msg = "login failed";
        loginView.showMsg(msg);
    }
}