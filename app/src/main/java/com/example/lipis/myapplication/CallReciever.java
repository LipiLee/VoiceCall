package com.example.lipis.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import android.util.Log;

public class CallReciever extends BroadcastReceiver {
    private static final String TAG = "CALL";

    @Override
    public void onReceive(Context context, Intent intent) {
        String state = intent.getStringExtra(TelephonyManager.EXTRA_STATE);
        if (state.equals(TelephonyManager.EXTRA_STATE_RINGING)) {
            Log.d(TAG, "Ringing");
        } else if (state.equals(TelephonyManager.EXTRA_STATE_IDLE)) {
            Log.d(TAG, "Idle");
        } else if (state.equals(TelephonyManager.EXTRA_STATE_OFFHOOK)) {
            Log.d(TAG, "OffHook");
        }
    }
}
