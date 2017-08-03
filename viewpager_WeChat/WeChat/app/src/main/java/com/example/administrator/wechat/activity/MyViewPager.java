package com.example.administrator.wechat.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

import com.example.administrator.wechat.R;

public class MyViewPager extends ViewPager {


    private boolean scroll = true;  //false 可左右滑动

    public MyViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }



    public MyViewPager(Context context) {
        super(context);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        if(scroll)
            return false;
        else
            return super.onTouchEvent(ev);
    }

    public void setScroll(boolean scroll){
        this.scroll = scroll;
    }

    @Override
    public void scrollTo(int x, int y) {
        super.scrollTo(x, y);
    }

    @Override
    public void setCurrentItem(int item) {
        super.setCurrentItem(item);
    }

    @Override
    public void setCurrentItem(int item, boolean smoothScroll) {
        super.setCurrentItem(item, smoothScroll);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if(scroll)
            return false;
        else
            return super.onInterceptTouchEvent(ev);
    }


}
