package com.example.a536038.testalarm;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    NotificationAlarmReceiver alarm = new NotificationAlarmReceiver();

    private static String FIRST_TIME = "firstTime";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences prefs = getSharedPreferences("TestNotification", Context.MODE_PRIVATE);

        boolean firstTime = prefs.getBoolean(FIRST_TIME, true);

        if (firstTime){

            alarm.setAlarm(this);

            SharedPreferences.Editor editor = prefs.edit();
            editor.putBoolean(FIRST_TIME, false);
            editor.commit();
        }
    }
}

