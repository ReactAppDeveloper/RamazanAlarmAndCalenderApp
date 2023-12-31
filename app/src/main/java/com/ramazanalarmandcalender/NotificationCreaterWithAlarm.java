package com.ramazanalarmandcalender;

/**
 * Created by Cclub on 13/05/2018.
 */

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.TaskStackBuilder;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import com.ramazanalarmandcalender.DailyQuranMethods;

/**
 * Created by Shiza on 16-06-2015.
 */
public class NotificationCreaterWithAlarm extends BroadcastReceiver
{

    DailyQuranMethods dailyQuranMethods = new DailyQuranMethods();

    @Override
    public void onReceive(Context context, Intent intent)
    {
        int notificationID = dailyQuranMethods.GetRandom(1,1000);
        dailyQuranMethods.setChapterVerseOfToday(context);
//        Toast.makeText(context,"I am on recieve",Toast.LENGTH_LONG).show();
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(context);

        mBuilder.setSmallIcon(R.mipmap.ic_launcher);
        mBuilder.setContentTitle("DQV");
        mBuilder.setContentText("Your Today's verse is one tap far!");

        Intent resultIntent = new Intent(context, QuranAyat.class);
        TaskStackBuilder stackBuilder = TaskStackBuilder.create(context );
        stackBuilder.addParentStack(QuranAyat.class);

// Adds the Intent that starts the Activity to the top of the stack
        stackBuilder.addNextIntent(resultIntent);
        PendingIntent resultPendingIntent = stackBuilder.getPendingIntent(0,PendingIntent.FLAG_UPDATE_CURRENT);
        mBuilder.setContentIntent(resultPendingIntent);
        mBuilder.setDefaults(NotificationCompat.DEFAULT_VIBRATE);

        NotificationManager mNotificationManager = (NotificationManager) context.getSystemService(context.NOTIFICATION_SERVICE);
        mBuilder.setAutoCancel(true);
// notificationID allows you to update the notification later on.
        mNotificationManager.notify(notificationID, mBuilder.build());

    }


}
