package com.xindong.friendsmap.presenters.interfaces;

import com.xindong.friendsmap.ui.view.interfaces.ILoginView;
import com.xindong.friendsmap.vo.requests.LoginRequest;

/**
 * Created by jxd on 16/7/14.
 */
public interface ILoginPresenter {

    /**
     * 登录
     * @param loginView
     * @param loginRequest
     */
    void login(ILoginView loginView, LoginRequest loginRequest);
}
