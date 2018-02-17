package com.example.gm7.myapplication;

import android.app.Application;
import android.content.Context;

/**
 * Created by islam on 2/15/2018.
 */

public class MyApplication extends Application{

    private static Context context;

    public void onCreate() {
        super.onCreate();
        MyApplication.context = getApplicationContext();
    }

    public static Context getAppContext() {
        return MyApplication.context;
    }
}
