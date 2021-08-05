package com.example.remoteuimqtt.elaborator.FirstActivityConfiguration;

import lombok.Data;

@Data
public class ConfigurationElement {

    //Element identifier
    String id;
    //Element text
    String label;
    //Widget type
    String widget;
    //Topic to subscribe to get the configuration for the second activity
    String topic;
}
