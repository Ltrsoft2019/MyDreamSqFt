package com.ltrsoft.mydreamsqft.app.util;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferencesManager {

    private final Context context;
    private String APP_INFO = "app_info";
    private static SharedPreferencesManager sharedPreferencesManager = null;


    public SharedPreferencesManager(final Context context) {
        this.context = context;
    }

    public void saveBoolean(final String key, final boolean data) {
        final SharedPreferences sharedPreferences = context.getSharedPreferences(APP_INFO, Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(key, data);
        editor.apply();
    }

    public boolean getBoolean(final String key, boolean defaultVal) {
        final SharedPreferences sharedPreferences = context.getSharedPreferences(APP_INFO, Context.MODE_PRIVATE);
        if (sharedPreferences != null && sharedPreferences.contains(key))
            return sharedPreferences.getBoolean(key, defaultVal);
        return defaultVal;
    }


    public void putString(final String key, final String data) {
        final SharedPreferences sharedPreferences = context.getSharedPreferences(APP_INFO, Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, data);
        editor.apply();
    }

    public String getString(final String key, String defaultVal) {
        final SharedPreferences sharedPreferences = context.getSharedPreferences(APP_INFO, Context.MODE_PRIVATE);
        if (sharedPreferences != null && sharedPreferences.contains(key))
            return sharedPreferences.getString(key, defaultVal);
        return defaultVal;
    }

    public void putInteger(final String key, final int data) {
        final SharedPreferences sharedPreferences = context.getSharedPreferences(APP_INFO, Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(key, data);
        editor.apply();
    }

    public int getInteger(final String key, int defaultVal) {
        final SharedPreferences sharedPreferences = context.getSharedPreferences(APP_INFO, Context.MODE_PRIVATE);
        try {
            if (sharedPreferences != null && sharedPreferences.contains(key))
                return sharedPreferences.getInt(key, defaultVal);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return defaultVal;
    }

    public void clearPreference() {
        final SharedPreferences sharedPreferences = context.getSharedPreferences(APP_INFO, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
    }

}
