package com.xindong.friendsmap.utils;

/**
 * Created by jxd on 16/7/17.
 *  一个全局的工具类，包含方法:
 *  可以读写sp文件
 */
public class FriendsMapUtil {

    /**
     * 读取默认的sp文件
     */
    public String readDefaultSharedPrefences(String key) {
        return readSharedPrefences("", key);
    }

    /**
     * 读取指定文件名的sp文件
     */
    public String readSharedPrefences(String filename, String key) {
        return null;
    }

}