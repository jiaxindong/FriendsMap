package com.xindong.friendsmap.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.view.WindowManager;

import com.xindong.friendsmap.app.AppManager;
import com.xindong.friendsmap.ui.activity.LoginActivity;

/**
 * Created by jxd on 16/7/14.
 */
public class ForceOfflineReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(final Context context, Intent intent) {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(context);
        dialogBuilder.setTitle("警告");
        dialogBuilder.setMessage("强制退出，请重新登录");
        dialogBuilder.setCancelable(false);
        dialogBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //销毁所有活动
                AppManager.finishAll();
                Intent intent = new Intent(context, LoginActivity.class);
                //在广播中启动activity，加上此标志
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
        AlertDialog dialog = dialogBuilder.create();
        //设置对话框类型为TYPE_SYSTEM_DIALOG，不然无法再广播接收器中弹出
        dialog.getWindow().setType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);
        dialog.show();
    }

}
