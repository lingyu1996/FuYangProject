package com.pingan.fuyanghospital.application;

import android.app.Application;


public class HospitalApplication extends Application {
    private static HospitalApplication appContext;

    public static HospitalApplication getInstance() {
        return appContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = this;
    }
}
