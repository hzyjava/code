package cn.jesse.mvp.model;

import cn.jesse.mvp.bean.UserBean;
import cn.jesse.mvp.listener.OnLoginListenerlble;

/**
 * Created by jesse on 15-6-24.
 */
public class UserModelImpl implements UserModellble {
    private OnLoginListenerlble listener;

    public UserModelImpl(OnLoginListenerlble listener){
        this.listener = listener;
    }

    @Override
    public void login(UserBean login) {
        boolean status = false;
        String username,password;
        username = login.getUsername();
        password = login.getPassword();
        //登录匹配逻辑
        if (username != null && "admin".equals(username))
            if (password != null && "123".equals(password))
                status = true;
        listener.loginStatus(status);
    }
}
