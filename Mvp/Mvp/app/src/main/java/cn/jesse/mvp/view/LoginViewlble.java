package cn.jesse.mvp.view;

/**
 * Created by jesse on 15-6-24.
 */
public interface LoginViewlble {
    public String getUsername();
    public String getPassword();
    public void clearUsername();
    public void clearPassword();
    public void showMsg(String msg);
}
