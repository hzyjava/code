package com.cc.mvp.activity;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.cc.mvp.R;
import com.cc.mvp.base.BaseActivity;
import com.cc.mvp.presenter.LoginPresenterIble;
import com.cc.mvp.presenter.LoginPresenterImpl;
import com.cc.mvp.view.LoginViewIble;

public class MainActivity extends BaseActivity implements LoginViewIble ,View.OnClickListener {

    private Button btn_login,btn_exit;
    private EditText edit_name,edit_pwd;
    private LoginPresenterIble mLoginPresenterIble ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        initData();
    }


    @Override
    public void initView() {
        super.initView();
        btn_login = (Button)findViewById(R.id.btn_login);
        btn_exit = (Button)findViewById(R.id.btn_exit);
        btn_login.setOnClickListener(this);
        btn_exit.setOnClickListener(this);
        edit_name = (EditText) findViewById(R.id.edit_name);
        edit_pwd = (EditText) findViewById(R.id.edit_pwd);
    }



    @Override
    public void initData() {
        super.initData();
        mLoginPresenterIble = new LoginPresenterImpl(this);
        //this 就是这个类的实例
    }

    @Override
    public String getAccount() {
        return edit_name.getText().toString();
    }

    @Override
    public String getPwd() {
        return edit_pwd.getText().toString();
    }

    @Override
    public void clear() {
        edit_name.setText("");
        edit_pwd.setText("");
    }

    @Override
    public void showMsg(String msg) {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_login:
                Log.d("","点击登录");
                mLoginPresenterIble.login();
                break;
            case R.id.btn_exit:
                Log.d("","点击退出");
                mLoginPresenterIble.exit();
                break;

        }
    }
}
