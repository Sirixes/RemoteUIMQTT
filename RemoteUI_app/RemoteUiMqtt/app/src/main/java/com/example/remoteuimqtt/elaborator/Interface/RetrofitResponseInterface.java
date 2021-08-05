package com.example.remoteuimqtt.elaborator.Interface;

import android.widget.LinearLayout;

import androidx.fragment.app.FragmentActivity;

import com.example.remoteuimqtt.elaborator.TreeElement;

import java.util.List;

import retrofit2.Call;

public interface RetrofitResponseInterface {
    void retrofitResponse(Call<List<TreeElement>> items, LinearLayout layout, FragmentActivity fragmentActivity);
}
