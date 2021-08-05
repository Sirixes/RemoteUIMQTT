package com.example.remoteuimqtt.elaborator;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import com.example.remoteuimqtt.R;
import com.example.remoteuimqtt.elaborator.FirstActivityConfiguration.MqttClientCreator;

import org.eclipse.paho.android.service.MqttAndroidClient;

import lombok.SneakyThrows;

public class MainActivity extends AppCompatActivity {

    public static String topic = "";

    @SneakyThrows
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout layout = findViewById(R.id.MainLinearLayout);
        new MqttClientCreator().createClient(layout, MainActivity.this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.refresh_layout, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.action_refresh){
            finish();
            startActivity(getIntent());
        }

        return true;
    }

}