package com.example.sven.broadcastclient;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void sendBroadcastNeedPermission(View view){
        sendBroadcast(new Intent("com.sven.action.my.receiver.need.permission"));
    }

    public void sendBroadcastWithPermission(View view){
        sendBroadcast(new Intent("com.sven.action.my.receiver.with.permission"), "com.sven.permission.my.receiver.RECEIVE");
    }

    public void sendBroadcastWithFlag(View view){
        Intent intent = new Intent("android.intent.action.myreceiver");
        intent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
        sendBroadcast(intent);
    }

    public void sendOrderBroadcast(View view){
//        sendBroadcast(new Intent("com.sven.action.my.receiver.orderd.receiver"));
        sendOrderedBroadcast(new Intent("com.sven.action.my.receiver.ordered.receiver"), null);
    }

}
