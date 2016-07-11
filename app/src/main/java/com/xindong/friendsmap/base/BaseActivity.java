package com.xindong.friendsmap.base;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.xindong.friendsmap.app.AppManager;

/**
 * Created by jxd on 16/7/11.
 */
public class BaseActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppManager.addActivity(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        AppManager.removeActivity(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
