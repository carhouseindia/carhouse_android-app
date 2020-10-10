package com.example.carhouse.fragment;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatEditText;

import com.example.carhouse.R;
import com.example.carhouse.activity.MainClass;

import butterknife.BindView;

public class BuyerFragment extends MainFragmentClass {

    @BindView(R.id.edtsearch)
    AppCompatEditText edtsearch;

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
        edtsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigator.navigateToSearchActivity(getActivity());
            }
        });
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