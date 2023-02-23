package com.taptrack.tcmptappy2.usb;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

public class PendingIntentUtils {

    public static PendingIntent getMutableBroadcastPendingIntent(
            Context context,
            int requestCode,
            Intent intent
    ) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            return PendingIntent.getBroadcast(context, requestCode, intent, PendingIntent.FLAG_MUTABLE);
        }
        return PendingIntent.getBroadcast(context, requestCode, intent, 0);
    }
}
