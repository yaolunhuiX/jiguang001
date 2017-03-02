package com.yunfeisky.jiguang001;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by Administrator on 2017/3/2.
 */
public class MyApplication extends Application{

    @Override
    public void onCreate() {
        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
        super.onCreate();
    }

}
