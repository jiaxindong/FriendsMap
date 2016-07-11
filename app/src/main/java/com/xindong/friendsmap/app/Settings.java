package com.xindong.friendsmap.app;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by jxd on 16/7/11.
 * 公共参数配置，封装SharedPreferences的操作
 */
public class Settings {

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    public Settings(Context context, String name) {
        sharedPreferences = context.getSharedPreferences(name, Context.MODE_PRIVATE);
    }

    /**
     * 加载一个String
     */
    public String loadString(String key) {
        return sharedPreferences.getString(key, "");
    }

    /**
     * 加载一个Int
     */
    public int loadInt(String key) {
        return sharedPreferences.getInt(key, -1);
    }

    /**
     * 加载一个Long
     */
    public Long getLong(String key) {
        return sharedPreferences.getLong(key, -1);
    }

    /**
     * 加载一个boolean
     */
    public boolean loadBoolean(String key) {
        return sharedPreferences.getBoolean(key, false);
    }

    /**
     * 加载一个float
     */
    public float loadFloat(String key) {
        return sharedPreferences.getFloat(key, -1);
    }

    /**
     * 以k-v形式保存一个String
     */
    public void saveString(String key, String value) {
        if (editor == null) {
            editor = sharedPreferences.edit();
        }
        editor.putString(key, value);
        editor.commit();
    }

    /**
     * 以k-v保存一个int
     */
    public void saveInt(String key, int value) {
        if (editor == null)
            editor = sharedPreferences.edit();

        editor.putInt(key, value);
        editor.commit();
    }

    /**
     * 以k-v保存一个long
     */
    public void saveLong(String key, long value) {
        if (editor == null)
            editor = sharedPreferences.edit();

        editor.putLong(key, value);
        editor.commit();
    }

    /**
     * 以k-v保存一个boolean
     */
    public void saveBoolean(String key, boolean value) {
        if (editor == null)
            editor = sharedPreferences.edit();

        editor.putBoolean(key, value);
        editor.commit();
    }

    /**
     * 以k-v保存一个float
     */
    public void saveFloat(String key, float value) {
        if (editor == null)
            editor = sharedPreferences.edit();

        editor.putFloat(key, value);
        editor.commit();
    }

    /**
     * 清空数据
     */
    public void clear() {
        if (editor == null) {
            editor = sharedPreferences.edit();
        }
        editor.clear();
        editor.commit();
    }

}
