package com.example.remoteuimqtt.elaborator;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

import com.example.remoteuimqtt.R;
import com.example.remoteuimqtt.elaborator.FirstActivityConfiguration.LayoutConfiguration;

public class DrawLayoutActivity extends AppCompatActivity {

    //Used to insert the value of the button clicked on the calculator
    public static String operation = "";
    public static int toggle = 0;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw_layout);
        LinearLayout layout = findViewById(R.id.MainLinearLayout);
        Intent intent = getIntent();
        String confFile = intent.getStringExtra("conf");
        new LayoutConfiguration().layoutConf(layout, this, confFile);
    }
}