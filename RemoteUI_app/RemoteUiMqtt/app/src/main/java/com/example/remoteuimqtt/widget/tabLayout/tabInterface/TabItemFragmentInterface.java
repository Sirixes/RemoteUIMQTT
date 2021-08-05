package com.example.remoteuimqtt.widget.tabLayout.tabInterface;

import com.example.remoteuimqtt.elaborator.TreeElement;
import com.example.remoteuimqtt.widget.tabLayout.TabItemFragment;

import java.util.List;

public interface TabItemFragmentInterface {
    //Function called by the adapter that takes the children item list and send it to the above function
    //to place the right children object in the right position between the tab
    TabItemFragment insertFragElements(List<TreeElement> childrenItem);
}
