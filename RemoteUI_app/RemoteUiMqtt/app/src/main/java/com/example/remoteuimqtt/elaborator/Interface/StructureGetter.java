package com.example.remoteuimqtt.elaborator.Interface;

import android.content.Context;

import com.example.remoteuimqtt.elaborator.TreeElement;

import java.util.List;

import lombok.SneakyThrows;
import retrofit2.Call;

public interface StructureGetter {
    //Function for retrofit call
    Call<List<TreeElement>> getStructure(Context context);
}
