package com.example.carhouse.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.recyclerview.widget.RecyclerView;

import com.example.carhouse.R;
import com.example.carhouse.adapter.SearchListAdapter;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class VarientSCFrag extends MainFragmentClass {
    String type;

    @NonNull
    public static VarientSCFrag newInstance()
    {
        VarientSCFrag varientSCFrag=new VarientSCFrag();
        /*Bundle bundle=new Bundle();
        bundle.putString("Type",type);
        varientSCFrag.setArguments(bundle);*/
        return varientSCFrag;
    }


    @Override
    protected int getFragmentLayout() {
        return R.layout.varient_sc;
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
