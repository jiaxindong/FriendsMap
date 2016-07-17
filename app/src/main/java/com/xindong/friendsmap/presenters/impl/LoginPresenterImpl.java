package com.xindong.friendsmap.presenters.impl;

import com.xindong.friendsmap.base.BasePresenter;
import com.xindong.friendsmap.base.BaseResponse;
import com.xindong.friendsmap.listener.JsonTransactionListener;
import com.xindong.friendsmap.models.impl.UserModelImpl;
import com.xindong.friendsmap.models.interfaces.IUserModel;
import com.xindong.friendsmap.presenters.interfaces.ILoginPresenter;
import com.xindong.friendsmap.ui.view.interfaces.ILoginView;
import com.xindong.friendsmap.utils.CommonUtil;
import com.xindong.friendsmap.vo.requests.LoginRequest;
import com.xindong.friendsmap.vo.responses.UserInfo;

/**
 * Created by jxd on 16/7/14.
 */
public class LoginPresenterImpl extends BasePresenter implements ILoginPresenter {

    @Override
    public void login(final ILoginView loginView, LoginRequest loginRequest) {

        // 校验用户名和密码是否为空
        if (isEmpty(loginRequest.userName, loginView, "用户名不能为空")) return;
        if (isEmpty(loginRequest.password, loginView, "密码不能为空")) return;

        // 实例化用户模型,调用登录方法,传入接口所需参数
        IUserModel userModel = new UserModelImpl(loginView.getContext());
        userModel.login(loginRequest, new JsonTransactionListener() {
            @Override
            public void onSuccess(BaseResponse response) {
                if (response.isSuccess()) {
                    // 登录成功,调用view接口显示用户信息
                    UserInfo userInfo = CommonUtil.getGson().fromJson(response.getData(), UserInfo.class);
                    loginView.loginCallback(userInfo);
                } else {
                    // 登录失败,根据业务需求进行处理...
                }
            }

            @Override
            public void onFailure(int errorCode) {
                // 网络访问异常
                super.onFailure(errorCode);
            }
        });
    }

}
