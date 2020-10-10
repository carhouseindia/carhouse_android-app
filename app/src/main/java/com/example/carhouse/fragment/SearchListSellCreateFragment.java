package com.example.carhouse.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.carhouse.R;
import com.example.carhouse.adapter.SearchListAdapter;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class SearchListSellCreateFragment extends MainFragmentClass {

    String type;

    @BindView(R.id.inputlayoutSearch)
    TextInputLayout inputlayoutSearch;

    @BindView(R.id.edtSearch)
    AppCompatEditText edtSearch;

    @BindView(R.id.recyclerList)
    RecyclerView recyclerList;

    SearchListAdapter adapter;
    private List<String> litData=new ArrayList<String>();
    @NonNull
    public static SearchListSellCreateFragment newInstance(String type)
    {
        SearchListSellCreateFragment sellerFragment=new SearchListSellCreateFragment();
        Bundle bundle=new Bundle();
        bundle.putString("Type",type);
        sellerFragment.setArguments(bundle);
        return sellerFragment;
    }

    @Override
    protected int getFragmentLayout() {
        return R.layout.list_search_frag;
    }

    @Override
    void intView() {
        type=getArguments().getString("Type");
        intRecycleView(recyclerList);
        adapter= new SearchListAdapter(getActivity(),litData,type);
        recyclerList.setAdapter(adapter);
//        addRightCancelDrawable();
    }

   /* private void addRightCancelDrawable() {
        boolean cancel = ContextCompat.getDrawable(this, R.drawable.ic_close);
        cancel?.setBounds(0,0, cancel.intrinsicWidth, cancel.intrinsicHeight);
        editText.setCompoundDrawables(null, null, cancel, null)
    }*/

    @Override
    void intListener() {

    }

    @Override
    void bindView(String Api, Object Responsedata) {

    }

    @Override
    void apiCall() {

    }
}
