package com.example.carhouse.fragment;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

import com.example.carhouse.R;
import com.example.carhouse.activity.DashboardActivity;
import com.example.carhouse.activity.MainClass;
import com.google.android.material.tabs.TabLayout;

import butterknife.BindView;

public class MenuFragment extends MainFragmentClass {

    @Nullable
    @BindView(R.id.txtBuyCar)
    AppCompatTextView txtBuyCar = null;


    @Nullable
    @BindView(R.id.txtSellCar)
    AppCompatTextView txtSellCar = null;

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
        return R.layout.menu_fragment;
    }


    @Override
    protected void intView() {
    }

    @Override
    void intListener() {
        txtBuyCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((DashboardActivity)getActivity()).switchTab(0);
            }
        });

        txtSellCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((DashboardActivity)getActivity()).switchTab(1);
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
