package com.example.remoteuimqtt.showLayout;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.FragmentActivity;
import com.example.remoteuimqtt.elaborator.TreeElement;
import com.example.remoteuimqtt.showLayout.Interface.ViewWidgetFactoryInterface;
import com.example.remoteuimqtt.widget.TextInputViewCreator;
import com.example.remoteuimqtt.widget.TextViewCreator;
import com.example.remoteuimqtt.widget.VideoViewCreator;
import com.example.remoteuimqtt.widget.button.ButtonViewCreator;
import com.example.remoteuimqtt.widget.tabLayout.TabContentFiller;

public class ViewWidgetFactory implements ViewWidgetFactoryInterface {

    @Override
    @RequiresApi(api = Build.VERSION_CODES.N)
    public View buildWidget(FragmentActivity fragActivity, Context mainContext, TreeElement treeElement, LinearLayout mainLayout) {
        String widget = treeElement.getWidget();
        //Define layout inflater from the context of the main activity
        LayoutInflater inflater = LayoutInflater.from(mainContext);
        switch (widget) {
            case WidgetType.BUTTON: {
                return new ButtonViewCreator().createButton(inflater, treeElement, mainLayout, mainContext);
            }
            case WidgetType.TEXTVIEW: {
                return new TextViewCreator().createText(inflater, treeElement);
            }
            case WidgetType.TEXTINPUT: {
                return new TextInputViewCreator().textInputCreator(inflater, treeElement);
            }
            case WidgetType.VIDEOVIEW: {
                return new VideoViewCreator().createVideoView(inflater, treeElement);
            }
            case WidgetType.TABLAYOUT: {
                return new TabContentFiller().tabContentFiller(inflater, treeElement, fragActivity);
            }
        }
        return null;
    }
}
