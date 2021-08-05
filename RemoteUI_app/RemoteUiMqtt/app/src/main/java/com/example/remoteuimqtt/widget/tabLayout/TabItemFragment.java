package com.example.remoteuimqtt.widget.tabLayout;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import com.example.remoteuimqtt.R;
import com.example.remoteuimqtt.elaborator.TreeElement;
import com.example.remoteuimqtt.showLayout.ViewWidgetFactory;
import com.example.remoteuimqtt.widget.tabLayout.tabInterface.TabItemFragmentInterface;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

public class TabItemFragment extends Fragment implements TabItemFragmentInterface {

    String tabContent;
    Gson gson = new Gson();


    @RequiresApi(api = Build.VERSION_CODES.N)
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        tabContent = getArguments().getString("tabContent");
        /*Type is the common superinterface for all types in the Java programming language.
         These include raw types, parameterized types, array types, type variables and primitive types.
         TypeToke creates a object of the type returned by get type
         */
        Type itemTreeListType = new TypeToken<List<TreeElement>>(){}.getType();
        List<TreeElement> childrenItem = gson.fromJson(tabContent, itemTreeListType);
        //Create the view for the layout that will contains our item
        View linearView = getLayoutInflater().inflate(R.layout.linear_layout, null);
        //ViewGroup to insert multiple elements in the tab
        LinearLayout layout = linearView.findViewById(R.id.linear);
        //If the tab doesn't have the tab content, then we will skip this part because we will receive a NullPointerException
        if(childrenItem != null){
            for (TreeElement treeElement : childrenItem) {
                View viewWidget = new ViewWidgetFactory().buildWidget(getActivity(), layout.getContext(), treeElement, layout);
                layout.addView(viewWidget);
            }
        }

        return layout;
    }

    //Function called by the adapter that takes the children item list and send it to the above function
    //to place the right children object in the right position between the tab
    @Override
    public TabItemFragment insertFragElements(List<TreeElement> childrenItem) {
        Gson gson = new Gson();
        TabItemFragment tabItemFragment = new TabItemFragment();
        Bundle args = new Bundle();
        args.putString("tabContent", gson.toJson(childrenItem));
        tabItemFragment.setArguments(args);
        return tabItemFragment;
    }

}
