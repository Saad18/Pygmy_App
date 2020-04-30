package com.example.pygmyapp.util;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

public class Prefs {
    private SharedPreferences preferences;
    public Prefs(Activity activity){
        this.preferences = activity.getPreferences(Context.MODE_PRIVATE);
    }

    public void saveHighScore(int score){
        int lastScore = preferences.getInt("Hight Score", 0);
        if(score > lastScore){
            preferences.edit().putInt("High Score", score).apply();

        }
    }

    public int getHighScore(){
        return preferences.getInt("High Score",0);
    }

}
