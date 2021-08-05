package com.example.remoteuimqtt.elaborator.Interface;

import android.content.Context;

import java.io.InputStream;
import java.util.Properties;

import lombok.SneakyThrows;

public interface Property {
    @SneakyThrows
    static String getProperty(String key, Context context) {

        Properties properties = new Properties();
        InputStream inputStream = context.getAssets().open("config.properties");
        properties.load(inputStream);
        return properties.getProperty(key);

    }
}
