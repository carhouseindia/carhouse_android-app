package com.example.carhouse.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.carhouse.R;
import com.example.carhouse.activity.CarList;
import com.example.carhouse.activity.MainClass;

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
        return new SearchListVH(layoutView,type,context);
    }

    @Override
    public void onBindViewHolder(@NonNull SearchListVH holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}


class SearchListVH extends RecyclerView.ViewHolder implements View.OnClickListener {

    @Nullable
    public AppCompatTextView textView = null;
    public LinearLayout lnrParent = null;
    View view;
    String type;
    Context context;

    public SearchListVH(@NonNull View itemView, String type, Context context)
    {
        super(itemView);
        view = itemView;
        this.type = type;
        this.context = context;
        textView = view.findViewById(R.id.textView);
        lnrParent = view.findViewById(R.id.lnrParent);

        view.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==lnrParent){
            if(type.equals("SEARCH")){
//                ((MainClass)context).navigator.navigateToCarListActivity(this);
                Intent intent = new Intent(context, CarList.class);
                context.startActivity(intent);
            }
        }
    }
}

