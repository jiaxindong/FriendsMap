package com.xindong.friendsmap.app;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.DisplayMetrics;

import java.util.Locale;

/**
 * Created by jxd on 16/7/11.
 * 自定义Application，用于初始化操作
 */
public class FriendsMapApplication extends Application {

    private static Context context;

    /**
     * 屏幕相关
     */
    public static int screenWidth;
    public static int screenHeight;
    public static float screenDensity;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        initScreenSize();
    }

    public static Context getContext() {
        return context;
    }

    /**
     * 获取版本号
     */
    public static String getVersion() {
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            String version = packageInfo.versionName;
            return version;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * 获取当前系统语言
     */
    public static String getLanguage() {
        Locale locale = context.getResources().getConfiguration().locale;
        String language = locale.getDefault().toString();
        return language;
    }

    /**
     * 初始化当前设备屏幕的宽高
     */
    private void initScreenSize() {
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        screenWidth = metrics.widthPixels;
        screenHeight = metrics.heightPixels;
        screenDensity = metrics.density;
    }

}