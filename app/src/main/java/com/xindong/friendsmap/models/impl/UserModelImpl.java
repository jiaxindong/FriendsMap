package com.xindong.friendsmap.models.impl;

import android.content.Context;

import com.xindong.friendsmap.base.BaseModel;
import com.xindong.friendsmap.listener.JsonTransactionListener;
import com.xindong.friendsmap.models.interfaces.IUserModel;
import com.xindong.friendsmap.vo.requests.LoginRequest;

/**
 * Created by jxd on 16/7/14.
 */
public class UserModelImpl extends BaseModel implements IUserModel {

    public UserModelImpl(Context context) {
        super(context);
    }

    @Override
    public void login(LoginRequest loginRequest, JsonTransactionListener transactionListener) {
        post(getContext(), "http://www.baidu.com", loginRequest, transactionListener);
    }
}
