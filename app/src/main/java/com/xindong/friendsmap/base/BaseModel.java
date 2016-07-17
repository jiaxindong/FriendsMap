package com.xindong.friendsmap.base;

import android.content.Context;

import com.xindong.friendsmap.listener.StringTransactionListener;

import org.json.JSONObject;

import java.util.Collections;
import java.util.Map;

/**
 * Created by jxd on 16/7/14.
 * 公共Model,所有Model继承自此类
 */
public class BaseModel {

    Context mContext;

    public BaseModel(Context context) {
        mContext = context;
    }

    public Context getContext() {
        return mContext;
    }

    /**
     * 发起一个不带参数的get请求
     *
     * @param context
     * @param url
     * @param transactionListener
     */
    public void get(Context context, String url, StringTransactionListener transactionListener) {
        // 获取一个空参数
        Map<String, String> emptyParams = Collections.emptyMap();
        get(context, url, emptyParams, transactionListener);
    }

    /**
     * 发起一个带参数的(实体类)的get请求
     *
     * @param context
     * @param url
     * @param t
     * @param transactionListener
     * @param <T>
     */
    public <T extends BaseRequest> void get(Context context, String url, T t, StringTransactionListener transactionListener) {
        get(context, url, t.getMapParams(), transactionListener);
    }

    /**
     * 发起一个带参数的(Map)的get请求
     *
     * @param context
     * @param url
     * @param params
     * @param transactionListener
     */
    public void get(Context context, String url, Map<String, String> params, StringTransactionListener transactionListener) {
    }

    /**
     * 发起一个带参数的(Json)的get请求
     */
    public void get(Context context, String url, JSONObject params, StringTransactionListener transactionListener) {

    }

    /**
     * 发起一个不带参数的post请求
     *
     * @param context
     * @param url
     * @param transactionListener
     */
    public void post(Context context, String url, StringTransactionListener transactionListener) {
        // 获取一个空参数
        Map<String, String> emptyParams = Collections.emptyMap();

        post(context, url, emptyParams, transactionListener);
    }

    /**
     * 发起一个带参数(实体类)的post请求
     *
     * @param context
     * @param url
     * @param t
     * @param transactionListener
     * @param <T>
     */
    public <T extends BaseRequest> void post(Context context, String url, T t, StringTransactionListener transactionListener) {
        post(context, url, t.getMapParams(), transactionListener);
    }

    /**
     * 发起一个带参数(Map)的post请求
     *
     * @param context
     * @param url
     * @param params
     * @param transactionListener
     */
    public void post(Context context, String url, Map<String, String> params, StringTransactionListener transactionListener) {

    }

    /**
     * 发起一个带参数(Json)的post请求
     */
    public void post(Context context, String url, JSONObject params, StringTransactionListener transactionListener) {

    }

    /**
     * 设置请求头
     *
     * @param header
     * @param value
     */
    public void setHeader(String header, String value) {
//        AsyncHttpNetCenter.getInstance().setHeader(header, value);
    }

    /**
     * 移除指定请求头
     *
     * @param header
     */
    public void removeHeader(String header) {
//        AsyncHttpNetCenter.getInstance().removeHeader(header);
    }

}
