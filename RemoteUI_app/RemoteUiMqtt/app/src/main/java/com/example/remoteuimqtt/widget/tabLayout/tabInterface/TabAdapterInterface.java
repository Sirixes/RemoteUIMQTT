package com.example.remoteuimqtt.widget.tabLayout.tabInterface;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.remoteuimqtt.elaborator.TreeElement;

import java.util.List;

public interface TabAdapterInterface {
    //From the MainActivity we pass the list of elements for a tab item and the position
    //and we put this in the map declared above
    void addTabChildren(List<TreeElement> children, int position);

    //We pass to the fragment the map element that contains position and elements that will be
    //placed in the correct tab item
    @NonNull
    Fragment createFragment(int position);

    int getItemCount();
}
