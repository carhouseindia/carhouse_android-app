package com.example.carhouse.fragment;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;

import com.example.carhouse.R;
import com.example.carhouse.activity.MainClass;

import butterknife.BindView;

public class SellerFragment extends MainFragmentClass {

    @BindView(R.id.sellMycar)
    AppCompatButton sellMycar;

    @NonNull
    public static SellerFragment newInstance()
    {
        SellerFragment sellerFragment=new SellerFragment();
        /*Bundle bundle=new Bundle();
        bundle.putString("Type",type);
        allOrdersFragment.setArguments(bundle);*/
        return sellerFragment;
    }


    @Override
    protected int getFragmentLayout() {
        return R.layout.seller_layout;
    }

    @Override
    protected void intView() {

    }

    @Override
    void intListener() {
        sellMycar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigator.navigateToSellerCreateScreen(getActivity());
            }
        });
    }


    @Override
    protected void bindView(String Api, Object Responsedata) {

    }

    @Override
    protected void apiCall() {

    }
}
