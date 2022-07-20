package com.quadvision.anydel.backend.ui.firebase

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.media.RingtoneManager
import android.os.Build
import android.text.Html
import androidx.core.app.NotificationCompat
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import com.quadvision.anydel.backend.R
import com.quadvision.anydel.backend.ui.home.HomeActivity
import com.quadvision.anydel.backend.utils.SecuredSharePreferenceUtil
import com.quadvision.anydel.backend.utils.isNotNullOrEmpty
import timber.log.Timber

class MyFirebaseMessagingService : FirebaseMessagingService() {


    override fun onMessageReceived(remoteMessage: RemoteMessage) {

        // Not getting messages here? See why this may be: https://goo.gl/39bRNJ
        Timber.d("From: ${remoteMessage.data}")

        // Check if message contains a data payload.
        if (remoteMessage.data.isNotEmpty()) {
            Timber.d("Message data payload: ${remoteMessage.data}")
            val intent = Intent(application, HomeActivity::class.java)
            var title = "anyDel"
            if(remoteMessage.data.containsKey("title")){
                title = remoteMessage.data["title"] ?: ""
            }

            var body = ""
            if(remoteMessage.data.containsKey("body")){
                body = remoteMessage.data["body"] ?: ""
            }
            sendNotification(application, intent, title, body)
        }
    }

    override fun onNewToken(token: String) {
        Timber.d("Refreshed token: $token")
        if (token.isNotNullOrEmpty()) {
            SecuredSharePreferenceUtil.putData(SecuredSharePreferenceUtil.FCM_TOKEN, token)
        }
    }

    //Context context, Intent intent, String msg
    private fun sendNotification(context: Context, intent: Intent, title: String, msg : String) {
        val contentIntent = PendingIntent.getActivity(
            context,
            1,
            intent,
            PendingIntent.FLAG_ONE_SHOT
        )

        val defaultSoundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
        val mBuilder: NotificationCompat.Builder =
            NotificationCompat.Builder(context, "pushNotification")
                .setSmallIcon(R.drawable.ic_anydel_app_notification)
                .setLargeIcon(
                    BitmapFactory.decodeResource(
                        context.resources,
                        R.mipmap.ic_launcher
                    )
                )
                .setContentTitle(title)
                .setStyle(NotificationCompat.BigTextStyle().bigText(Html.fromHtml(msg)))
                .setAutoCancel(true)
                .setSound(defaultSoundUri)
                .setContentText(Html.fromHtml(msg))
                .setContentIntent(contentIntent)

        val notificationManager =
            context.getSystemService(NOTIFICATION_SERVICE) as NotificationManager

        if (notificationManager != null) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                val CHANNEL_ID = application.packageName
                val name: CharSequence =
                    context.resources.getString(R.string.anydel_notification_channel) // The user-visible name of the channel.
                val importance = NotificationManager.IMPORTANCE_HIGH
                mBuilder.setChannelId(CHANNEL_ID)
                val mChannel = NotificationChannel(CHANNEL_ID, name, importance)
                notificationManager.createNotificationChannel(mChannel)
            }
            notificationManager.notify(mNotificationId++, mBuilder.build())
        }
    }

    companion object {
        private var mNotificationId = 1
        private const val TAG = "MyFirebaseMsgService"
    }
}