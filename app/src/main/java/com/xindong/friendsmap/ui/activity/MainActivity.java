package com.xindong.friendsmap.ui.activity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import com.xindong.friendsmap.R;
import com.xindong.friendsmap.base.BaseActivity;

public class MainActivity extends BaseActivity {

    private Button btnForceOff;

    @Override
    public void initContentView() {
        setContentView(R.layout.activity_main);
        btnForceOff = (Button) findViewById(R.id.btn_forceOff);
    }

    @Override
    public void initView() {
        btnForceOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.xindong.friendsmap.FORCE_OFFLINE");
                sendBroadcast(intent);
            }
        });
    }

    @Override
    public void initPresenter() {

    }

}
