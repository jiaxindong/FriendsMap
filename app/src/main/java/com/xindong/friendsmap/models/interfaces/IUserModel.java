package com.xindong.friendsmap.models.interfaces;

import com.xindong.friendsmap.listener.JsonTransactionListener;
import com.xindong.friendsmap.vo.requests.LoginRequest;

/**
 * Created by jxd on 16/7/14.
 * 用户模型接口-登陆
 */
public interface IUserModel {
    void login(LoginRequest loginRequest, JsonTransactionListener transactionListener);
}
