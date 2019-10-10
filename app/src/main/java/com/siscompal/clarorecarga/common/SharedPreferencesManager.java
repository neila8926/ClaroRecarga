package com.siscompal.clarorecarga.common;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferencesManager {

    private static final String APP_SETTINGS_FILE = "APP_SETTINGS";

    private SharedPreferencesManager() {}

    private static SharedPreferences getSharedPreferences() {
        return MyApp.getContext()
                .getSharedPreferences(APP_SETTINGS_FILE, Context.MODE_PRIVATE);

    }

    public static void setSomeStringValue(String dataLabel, String dataValue) {
        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putString(dataLabel, dataValue);
        editor.commit();

    }

    public static void setSomeBooleanValue(String dataLabel, boolean dataValue) {
        SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putBoolean(dataLabel, dataValue);
        editor.commit();

    }

    public static String getSomeStringValue(String datalabel) {
        return getSharedPreferences().getString(datalabel,null);

    }

    public static boolean getSomeBooleanValue(String datalabel) {
        return getSharedPreferences().getBoolean(datalabel,false);

    }
}
