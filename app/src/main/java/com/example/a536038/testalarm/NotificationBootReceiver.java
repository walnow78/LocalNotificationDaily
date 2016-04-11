package com.example.a536038.testalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class NotificationBootReceiver extends BroadcastReceiver {
    NotificationAlarmReceiver alarm = new NotificationAlarmReceiver();
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.BOOT_COMPLETED")) {
            alarm.setAlarm(context);
        }
    }
}