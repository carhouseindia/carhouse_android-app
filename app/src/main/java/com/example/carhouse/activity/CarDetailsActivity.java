package com.example.carhouse.activity;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import com.example.carhouse.R;
import com.example.carhouse.adapter.CarListAdapter;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import butterknife.BindView;

public class CarDetailsActivity extends MainClass {

    @Nullable
    @BindView(R.id.collapsing_toolbar)
    CollapsingToolbarLayout collapsingToolbar;

    @Nullable
    @BindView(R.id.appbar)
    AppBarLayout appBarLayout;

    @Nullable
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Nullable
    @BindView(R.id.simlerRecyview)
    RecyclerView simlerRecyview;

    List<String> litData=new ArrayList<String>();
    CarListAdapter adapter;

    @Override
    protected int getActivityLayout() {
        return R.layout.activity_car_details;
    }

    @Override
    protected void intView() {
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        initCollapsingToolbar();

        intRecycleView(simlerRecyview);
        adapter=new CarListAdapter(CarDetailsActivity.this,litData);
        simlerRecyview.setAdapter(adapter);
    }
    private void initCollapsingToolbar() {
        collapsingToolbar.setTitle(" ");
        appBarLayout.setExpanded(true);

        // hiding & showing the title when toolbar expanded & collapsed
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            boolean isShow = false;
            int scrollRange = -1;

            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.getTotalScrollRange();
                }
                if (scrollRange + verticalOffset == 0) {
                    toolbar.setBackgroundColor(Color.TRANSPARENT);
                    /*if (sellarData!=null){
                        if (sellarData.getName()!=null){
                            collapsingToolbar.setTitle(sellarData.getName());
                        }else {
                            collapsingToolbar.setTitle(getString(R.string.txt_businessname));
                        }
                    }else {
                        collapsingToolbar.setTitle(getString(R.string.txt_businessname));
                    }*/

                    collapsingToolbar.setTitle("Car Name");

                    collapsingToolbar.setCollapsedTitleTextColor(getResources().getColor(R.color.white));
                    isShow = true;
                } else if (isShow) {
                    toolbar.setBackgroundColor(Color.TRANSPARENT);
                    collapsingToolbar.setTitle(" ");
                    isShow = false;


                }
            }
        });
    }

    @Override
    protected void intLisener() {

    }

    @Override
    protected void bindView(String Api, Object Responsedata) {

    }

    @Override
    protected void apiCall() {

    }
}