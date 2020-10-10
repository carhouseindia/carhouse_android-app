package com.example.carhouse.activity;

import android.widget.TextView;

import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.carhouse.R;
import com.example.carhouse.adapter.SearchListAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class SearchActivity extends MainClass {

    @BindView(R.id.recSearch)
    RecyclerView recSearch;

    @BindView(R.id.edtSearch)
    AppCompatEditText edtSearch;

    @BindView(R.id.img_close)
    AppCompatImageView img_close;

    @BindView(R.id.tvNoResultsFound)
    TextView tvNoResultsFound;

    private List<String> litData=new ArrayList<String>();
    SearchListAdapter adapter;

    @Override
    protected int getActivityLayout() {
        return R.layout.activity_search;
    }

    @Override
    protected void intView() {
        intRecycleView(recSearch);
        adapter= new SearchListAdapter(SearchActivity.this,litData,"");
        recSearch.setAdapter(adapter);
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
