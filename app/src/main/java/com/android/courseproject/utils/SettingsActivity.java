package com.android.courseproject.utils;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.support.annotation.Nullable;

import com.android.courseproject.R;

/**
 * Created by User
 */

public class SettingsActivity extends PreferenceActivity
        implements SharedPreferences.OnSharedPreferenceChangeListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preference_layout);
        ListPreference listPreference = (ListPreference) findPreference("language_preference");
        listPreference.setOnPreferenceChangeListener(
                new Preference.OnPreferenceChangeListener(){

                    @Override
                    public boolean onPreferenceChange(Preference preference, Object o) {
                        return false;
                    }
                });

    }

    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String s) {

    }
}
