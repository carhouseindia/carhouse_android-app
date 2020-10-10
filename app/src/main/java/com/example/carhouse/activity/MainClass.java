package com.example.carhouse.activity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.carhouse.R;
import com.example.carhouse.navigator.Navigator;
import com.example.carhouse.sharedpreference.PreferenceManager;

import java.util.Objects;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class MainClass extends AppCompatActivity {
    public Navigator navigator = null;
    public PreferenceManager pManager = null;

    private Unbinder unbinder;
    public static String PACKAGE_NAME;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(getActivityLayout());
        unbinder = ButterKnife.bind(this);
        /*if (toolbar != null) {
            setSupportActionBar(toolbar);
            Objects.requireNonNull(getSupportActionBar()).setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }*/
        initialization();
        intView();
        intLisener();
        apiCall();
    }

    public void initialization() {

        navigator = new Navigator();
        PACKAGE_NAME = getApplicationContext().getPackageName();
        PreferenceManager.initializeInstance(getApplicationContext());
        pManager = PreferenceManager.getInstance();

    }
    protected abstract int getActivityLayout();

    protected abstract void intView();

    protected abstract void intLisener();

    protected abstract void bindView(String Api, Object Responsedata);

    protected abstract void apiCall();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(unbinder!=null)
        {
            unbinder.unbind();
        }
    }

    public void changeTextView(View view, int color, int style) {
        try {
            if (view != null) {
                TextView tabItemName = view.findViewById(R.id.title);
                tabItemName.setTextColor(color);
                tabItemName.setTypeface(null, style);
            }
        } catch (Exception e) {
            Log.e("TAG",""+e.getMessage());
        }
    }

    public void setToastMessage(String message) {
        Toast.makeText(MainClass.this, message, Toast.LENGTH_SHORT).show();
    }

    public void intRecycleView(@NonNull RecyclerView recyclerView)
    {
        recyclerView.setHasFixedSize(true);
        final LinearLayoutManager mLayoutManager = new LinearLayoutManager(MainClass.this);
        recyclerView.setLayoutManager(mLayoutManager);
    }
}
