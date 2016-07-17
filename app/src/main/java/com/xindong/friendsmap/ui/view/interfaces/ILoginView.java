package com.xindong.friendsmap.ui.view.interfaces;

import com.xindong.friendsmap.base.IBaseView;
import com.xindong.friendsmap.vo.responses.UserInfo;

/**
 * Created by jxd on 16/7/14.
 * 用户登录View接口
 */
public interface ILoginView extends IBaseView {

    /**
     * 登录成功视图回调
     * @param userInfo
     */
    void loginCallback(UserInfo userInfo);

}
