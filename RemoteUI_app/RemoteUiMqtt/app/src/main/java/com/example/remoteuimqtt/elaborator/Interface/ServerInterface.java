package com.example.remoteuimqtt.elaborator.Interface;

import com.example.remoteuimqtt.elaborator.TreeElement;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ServerInterface {

    @GET("/mystructure.json")
    Call<List<TreeElement>> getItems();
}
