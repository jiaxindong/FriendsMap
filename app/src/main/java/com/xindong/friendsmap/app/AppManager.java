package com.xindong.friendsmap.app;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jxd on 16/7/11.
 * 自定义Activity堆栈管理类
 */
public class AppManager {

    private static List<Activity> activities = new ArrayList<Activity>();

    public static void addActivity(Activity activity) {
        activities.add(activity);
    }

    public static void removeActivity(Activity activity) {
        activities.remove(activity);
    }

    public static void finishAll() {
        for (Activity activity : activities) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }

}
