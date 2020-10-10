package com.example.carhouse.fragment;

import androidx.annotation.NonNull;
import com.example.carhouse.R;

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
