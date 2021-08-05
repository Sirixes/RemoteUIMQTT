package com.example.remoteuimqtt.showLayout;

import androidx.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/*We use TypedDef because Enums add at least two times more bytes to the total APK size than plain
 constants and can use 5 to 10 times more RAM memory than equivalent constants.*/
public class WidgetType{

    /*RetentionPolicy.SOURCE: Discard during the compile. These annotations don't make any
    sense after the compile has completed*/

    @Retention(RetentionPolicy.SOURCE)
    @StringDef({BUTTON, TEXTVIEW, TABLAYOUT, TEXTINPUT, VIDEOVIEW})

    @interface getWidget{}

    public static final String BUTTON = "button";
    public static final String TEXTVIEW = "textView";
    public static final String TABLAYOUT = "tabLayout";
    public static final String TEXTINPUT = "textInput";
    public static final String VIDEOVIEW = "videoView";


    String currentWidget;
    public void setWidget(@getWidget String type){
        this.currentWidget = type;
    }

    @getWidget
    public String getWidget(){
        return currentWidget;
    }



}
