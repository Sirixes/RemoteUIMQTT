package com.example.remoteuimqtt.elaborator;

import android.content.Context;
import android.content.Intent;

public class DrawActivityIntent implements DrawActivityIntentInterface{
    @Override
    public void drawActivityIntent(String confFile, Context context) {
        Intent intent = new Intent(context, DrawLayoutActivity.class);
        intent.putExtra("conf", confFile);
        context.startActivity(intent);
    }
}
