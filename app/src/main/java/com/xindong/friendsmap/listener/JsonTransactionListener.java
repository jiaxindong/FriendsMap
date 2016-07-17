package com.xindong.friendsmap.listener;

import com.xindong.friendsmap.base.BaseResponse;

/**
 * Created by jxd on 16/7/14.
 */
public abstract class JsonTransactionListener extends StringTransactionListener {

    /**
     * 带Json数据的成功回调
     *
     * @param response
     */
    public abstract void onSuccess(BaseResponse response);

    @Override
    public void onSuccess(String response) {
//        JsonResponse jsonResponse = JsonResponse.getResponse(response);
//        onSuccess(jsonResponse);
    }

}
