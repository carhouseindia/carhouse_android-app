package com.example.carhouse.fragment;

import androidx.annotation.NonNull;

import com.example.carhouse.R;
import com.example.carhouse.activity.MainClass;

public class BuyerFragment extends MainFragmentClass {

    @NonNull
    public static BuyerFragment newInstance()
    {
        BuyerFragment buyerFragment=new BuyerFragment();
        /*Bundle bundle=new Bundle();
        bundle.putString("Type",type);
        allOrdersFragment.setArguments(bundle);*/
        return buyerFragment;
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