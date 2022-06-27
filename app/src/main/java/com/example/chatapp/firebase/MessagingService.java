package com.example.chatapp.firebase;

import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MessagingService extends FirebaseMessagingService {

    @Override
    public void onNewToken(@NonNull String token) {
        super.onNewToken(token);
        //Log.d("FCM","Token:===================> " + token);
        //String u = token;
        //Toast.makeText(MessagingService.this,u, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        //Log.d("FCM","Message:=====================> " + remoteMessage.getNotification().getBody());
        //String u = remoteMessage.getNotification().getBody().toString();
        //Toast.makeText(MessagingService.this,u, Toast.LENGTH_LONG).show();
    }
}
