package com.example.remoteuimqtt.elaborator;

import java.util.List;

import lombok.Data;

@Data
//Structure of an element
public class TreeElement {
    //Widget id
    String id;
    //Label of the widget
    String text;
    //Type of widget (button, text..)
    String widget;
    String value;
    int flag;
    //Children of an element
    List<TreeElement> treeElementChildren;

}



