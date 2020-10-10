package com.example.carhouse.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;

import com.example.carhouse.R;
import com.example.carhouse.activity.MainClass;

public class MenuFragment extends MainFragmentClass {

    @NonNull
    public static MenuFragment newInstance()
    {
        MenuFragment menuFragment=new MenuFragment();
        /*Bundle bundle=new Bundle();
        bundle.putString("Type",type);
        allOrdersFragment.setArguments(bundle);*/
        return menuFragment;
    }


    @Override
    protected int getFragmentLayout() {
        return R.layout.buyer_layout;
    }


    @Override
    protected void intView() {

    }

    @Override
    void intListener() {

    }


    @Override
    protected void bindView(String Api, Object Responsedata) {

    }

    @Override
    protected void apiCall() {

    }
}
