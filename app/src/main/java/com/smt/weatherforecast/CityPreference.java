package com.smt.weatherforecast;

import android.app.Activity;
import android.content.SharedPreferences;

public class CityPreference {
    SharedPreferences prefs;

    public CityPreference(Activity activity){
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    // If the user has not chosen a city yet, return
    // Dhaka as the default city
    String getCity(){
        return prefs.getString("city", "Dhaka, BD");
    }

    void setCity(String city){
        prefs.edit().putString("city", city).commit();
    }
}