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

import java.util.ArrayList;
import java.util.List;

public class CarListAdapter extends RecyclerView.Adapter<CarListVH> {

    private List<String> litData=new ArrayList<String>();
    private Context context;
    String type;

    public CarListAdapter(Context context,List<String> litData) {
        this.litData = litData;
        this.context = context;
    }

    @NonNull
    @Override
    public CarListVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.car_list_item, parent,false);
        return new CarListVH(layoutView,context);
    }

    @Override
    public void onBindViewHolder(@NonNull CarListVH holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}

class CarListVH extends RecyclerView.ViewHolder implements View.OnClickListener {

    @Nullable

    View view;
    String type;
    Context context;

    public CarListVH(@NonNull View itemView, Context context)
    {
        super(itemView);
        view = itemView;
        this.context = context;


//        view.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
