package com.example.carhouse.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.recyclerview.widget.RecyclerView;

import com.example.carhouse.R;

import java.util.ArrayList;
import java.util.List;

public class SearchListAdapter extends RecyclerView.Adapter<SearchListVH> {
    private List<String> litData=new ArrayList<String>();
    private Context context;
    String type;

    public SearchListAdapter(Context context,List<String> litData, String type) {
        this.litData = litData;
        this.context = context;
        this.type = type;
    }

    @NonNull
    @Override
    public SearchListVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.search_list_item_sc, parent,false);
        return new SearchListVH(layoutView);
    }

    @Override
    public void onBindViewHolder(@NonNull SearchListVH holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}


class SearchListVH extends RecyclerView.ViewHolder
{

    @Nullable
    public TextView textView = null;
    View view;

    public SearchListVH(@NonNull View itemView)
    {
        super(itemView);
        view = itemView;
        textView = view.findViewById(R.id.textView);


    }
}

