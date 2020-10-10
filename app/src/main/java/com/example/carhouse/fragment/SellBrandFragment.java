package com.example.carhouse.fragment;

import androidx.annotation.NonNull;

import com.example.carhouse.R;

public class SellBrandFragment extends MainFragmentClass {

    @NonNull
    public static SellBrandFragment newInstance()
    {
        SellBrandFragment menuFragment=new SellBrandFragment();
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
