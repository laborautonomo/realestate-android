package com.wmendez.realestate.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.wmendez.realestate.R;

public class Pref {

    public static String getServerUrl(Context context) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        return sp.getString("pref_server_url", context.getString(R.string.pref_server_url));
    }

}
