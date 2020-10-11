package com.example.carhouse.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.example.carhouse.R;
import com.example.carhouse.activity.MainClass;
import java.util.ArrayList;
import java.util.List;

public class CarListAdapter extends RecyclerView.Adapter<CarListVH> {

    private List<String> litData=new ArrayList<String>();
    private Activity context;
    String type;

    public CarListAdapter(Activity context, List<String> litData) {
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
    Activity context;

    public CarListVH(@NonNull View itemView, Activity context)
    {
        super(itemView);
        view = itemView;
        this.context = context;


        view.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==view){
            ((MainClass)context).navigator.navigateToCarDetailsActivity(context);
        }
    }
}
