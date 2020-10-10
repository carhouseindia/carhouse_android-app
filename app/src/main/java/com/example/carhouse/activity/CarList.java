package com.example.carhouse.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.carhouse.R;
import com.example.carhouse.adapter.CarListAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class CarList extends MainClass {

    @BindView(R.id.recyclerList)
    RecyclerView recyclerList;

    @BindView(R.id.lnrSort)
    LinearLayout lnrSort;

    @BindView(R.id.lnrFilter)
    LinearLayout lnrFilter;

    @BindView(R.id.edtSearch)
    AppCompatEditText edtSearch;

    @BindView(R.id.imgClose)
    AppCompatImageView imgClose;

    CarListAdapter adapter;
    private List<String> litData=new ArrayList<String>();

    @Override
    protected int getActivityLayout() {
        return R.layout.activity_car_list;
    }

    @Override
    protected void intView() {
        intRecycleView(recyclerList);
        adapter=new CarListAdapter(CarList.this,litData);
        recyclerList.setAdapter(adapter);

    }

    @Override
    protected void intLisener() {
        edtSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigator.navigateToSearchActivity(CarList.this);
            }
        });

        imgClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        lnrFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigator.navigateToFilterAndSorActivity(CarList.this);
            }
        });

        lnrSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigator.navigateToFilterAndSorActivity(CarList.this);
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