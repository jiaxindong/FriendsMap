package com.xindong.friendsmap.utils;

import android.util.Log;

/**
 * Created by jxd on 16/7/14.
 */
public class Logger {

    public static final int VERBOSE = 1;
    public static final int DEBUG = 2;
    public static final int INFO = 3;
    public static final int WARN = 4;
    public static final int ERROR = 5;
    public static final int NOTHING = 6;
    public static final int LEVEL = VERBOSE; //用来控制打印哪个级别的日志

    public static void v(String tag, String msg) {
        if(LEVEL <= VERBOSE) {
            Log.v(tag, msg);
        }
    }
    public static void d(String tag, String msg) {
        if(LEVEL <= DEBUG) {
            Log.v(tag, msg);
        }
    }
    public static void i(String tag, String msg) {
        if(LEVEL <= INFO) {
            Log.v(tag, msg);
        }
    }
    public static void w(String tag, String msg) {
        if(LEVEL <= WARN) {
            Log.v(tag, msg);
        }
    }
    public static void e(String tag, String msg) {
        if(LEVEL <= ERROR) {
            Log.v(tag, msg);
        }
    }
}
