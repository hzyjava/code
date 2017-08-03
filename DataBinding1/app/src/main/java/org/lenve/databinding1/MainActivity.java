package org.lenve.databinding1;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.lenve.databinding1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        UserEntity user = new UserEntity();
        user.setAge(34);
        user.setUsername("zhangsan");
        user.setNickname("张三");
        activityMainBinding.setUser(user);
    }
}
