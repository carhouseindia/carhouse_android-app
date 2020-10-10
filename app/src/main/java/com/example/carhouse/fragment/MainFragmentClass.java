package com.example.carhouse.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.carhouse.navigator.Navigator;
import com.example.carhouse.sharedpreference.PreferenceManager;

import butterknife.ButterKnife;

public abstract class MainFragmentClass extends Fragment {
    public Navigator navigator;
    public PreferenceManager pManager;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        try
        {
            navigator = new Navigator();
            PreferenceManager.initializeInstance(getActivity());
            pManager = PreferenceManager.getInstance();
        }
        catch (Exception e)
        {
            Log.e("Exception BaseActivity",e.toString());
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = null;
        try {

            view = inflater.inflate(getFragmentLayout(), container, false);
            ButterKnife.bind(this, view);
            initialization();
            intView();
            intListener();
            apiCall();
        }
        catch (Exception e)
        {
            errLogPrint(e.getMessage());
        }


        return view;
    }

    public void initialization()
    {
        /*if (btnretry != null) {
            btnretry.setOnClickListener(v -> {

                apiCall();
            });
        }*/
    }

    protected abstract int getFragmentLayout();

    abstract void intView();

    abstract void intListener();

    abstract void bindView(String Api, Object Responsedata);

    abstract void apiCall();

    public void errLogPrint(String msg){
        Log.e("TAG",""+msg);
    }

    public void setToastMessage(String message) {
        Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();
    }

    public void intRecycleView(@NonNull RecyclerView recyclerView)
    {
        recyclerView.setHasFixedSize(true);
        final LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
    }
}
