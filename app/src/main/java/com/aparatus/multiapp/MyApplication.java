package com.aparatus.multiapp;

import android.app.Application;
import android.content.Context;

import com.vk.sdk.VKSdk;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        VKSdk.initialize(this);

    }
}
