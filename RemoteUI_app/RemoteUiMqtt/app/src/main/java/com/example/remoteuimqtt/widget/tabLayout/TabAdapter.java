package com.example.remoteuimqtt.widget.tabLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.remoteuimqtt.elaborator.TreeElement;
import com.example.remoteuimqtt.widget.tabLayout.tabInterface.TabAdapterInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TabAdapter extends FragmentStateAdapter implements TabAdapterInterface {

    int mNumOfTabs;
    //Map used to keep trace of the elements to insert in a position (which represent a tabItem)
    //position represented by the Key of the map and elements by List<ItemTree>
    final Map<Integer, List<TreeElement>> tabChildren;

    public TabAdapter(FragmentActivity fa, int NumOfTabs) {
        super(fa);
        this.mNumOfTabs = NumOfTabs;
        this.tabChildren = new HashMap<>();

    }

    //From the MainActivity we pass the list of elements for a tab item and the position
    //and we put this in the map declared above
    @Override
    public void addTabChildren(List<TreeElement> children, int position){
        this.tabChildren.put(position, children);
    }

    //We pass to the fragment the map element that contains position and elements that will be
    //placed in the correct tab item
    @NonNull
    @Override
    public Fragment createFragment(int position) {
            return new TabItemFragment().insertFragElements(this.tabChildren.get(position));
    }

    @Override
    public int getItemCount() {
        return mNumOfTabs;
    }
}
