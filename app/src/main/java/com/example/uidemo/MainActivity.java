package com.example.uidemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.uidemo.activity.CardViewActivity;

import java.util.ArrayList;

import apis.amapv2.com.listviewlibrary.activity.BaseListActivty;
import apis.amapv2.com.listviewlibrary.bean.ItemObject;

public class MainActivity extends BaseListActivty {

    @Override
    protected void addData(ArrayList<ItemObject> data) {
        data.add(new ItemObject("CardView例子", CardViewActivity.class));
    }
}