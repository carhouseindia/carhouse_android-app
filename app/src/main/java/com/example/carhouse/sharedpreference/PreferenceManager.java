package com.example.carhouse.sharedpreference;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/*
  PreferenceManager  class is used for managing the data

   Created by BrickCube.
   Copyright © 2016 BrickCube, Inc. All rights reserved.
*/
public class PreferenceManager {

    private static final String PREF_NAME = "com.neigbore";
    private static PreferenceManager sInstance;
    private final SharedPreferences mPref;
    private PreferenceManager(Context context)
    {
        mPref = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    }
    public static synchronized void initializeInstance(@NonNull Context context)
    {
        if (sInstance == null)
        {
            sInstance = new PreferenceManager(context);
        }
    }
    public static synchronized PreferenceManager getInstance()
    {
        if (sInstance == null)
        {
            throw new IllegalStateException(PreferenceManager.class.getSimpleName() +
                    " is not initialized, call initializeInstance(..) method first.");
        }
        return sInstance;
    }

    /*store data in shared preference */

    public void setValue(String key, String value)
    {
        mPref.edit().putString(key, value).apply();
    }

    public void setValue(String key, int value)
    {
        mPref.edit().putInt(key, value).apply();
    }

    public void setValue(String key, long value)
    {
        mPref.edit().putLong(key, value).apply();
    }

    public void setValue(String key, boolean value)
    {
        mPref.edit().putBoolean(key, value).apply();
    }

    public boolean getboolValue(String key)
    {
        return  mPref.getBoolean(key, false);
    }

    public Long getLongValue(String key)
    {
        return  mPref.getLong(key, 0);
    }

    public boolean getNewOrderValue(String key)
    {
        return  mPref.getBoolean(key, true);
    }

    public boolean getRemainderValue(String key)
    {
        return  mPref.getBoolean(key, true);
    }

    /* checking key in shared preference */
    public int existValue(String key)
    {
        return mPref.getString(key, "").length();
    }
    /* retrive data from shared preference */
    @Nullable
    public String getValue(String key)
    {
        return mPref.getString(key, "");
    }

    public int getIntValue(String key)
    {
        return mPref.getInt(key, 0);
    }

    public int getSnoozeIntValue(String key)
    {
        return mPref.getInt(key, 5);
    }

    /* delete specific data from shared preference */
    public void remove(String key)
    {
        mPref.edit().remove(key).apply();
    }
    /* delete entire data from shared preference */
    public boolean clear()
    {
        return mPref.edit().clear().commit();
    }
}
