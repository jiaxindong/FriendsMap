package com.xindong.friendsmap.ui.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.xindong.friendsmap.R;
import com.xindong.friendsmap.base.BaseActivity;
import com.xindong.friendsmap.ui.view.interfaces.ILoginView;
import com.xindong.friendsmap.vo.responses.UserInfo;

/**
 * Created by jxd on 16/7/14.
 */
public class LoginActivity extends BaseActivity implements ILoginView {

    private EditText etPhone;
    private EditText etPassword;
    private Button btnLogin;
    private CheckBox cbRememberPassword;

    private SharedPreferences sp;
    private SharedPreferences.Editor editor;

    @Override
    public void initContentView() {
        setContentView(R.layout.activity_login);

        etPhone = (EditText) findViewById(R.id.account);
        etPassword = (EditText) findViewById(R.id.password);
        btnLogin = (Button) findViewById(R.id.login);
        cbRememberPassword = (CheckBox) findViewById(R.id.remember_pass);
    }

    @Override
    public void initView() {

        sp = PreferenceManager.getDefaultSharedPreferences(this);

        boolean isRemember = sp.getBoolean("remember_password", false);
        if(isRemember) {
            //将记住的电话号码和密码设置到文本框中
            etPhone.setText(sp.getString("phone", ""));
            etPassword.setText(sp.getString("password", ""));
            cbRememberPassword.setChecked(true);
        }

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone = etPhone.getText().toString();
                String password = etPassword.getText().toString();
                //校验用户名和密码
                if(phone.equals("jxd") && password.equals("12345")) {
                    editor = sp.edit();
                    if(cbRememberPassword.isChecked()) {
                        editor.putBoolean("remember_password", true);
                        editor.putString("phone", phone);
                        editor.putString("password", password);
                    } else {
                        editor.clear();
                    }
                    editor.commit();
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(LoginActivity.this, "电话号或密码错误", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    @Override
    public void initPresenter() {

    }

    @Override
    public void loginCallback(UserInfo userInfo) {

    }

}
