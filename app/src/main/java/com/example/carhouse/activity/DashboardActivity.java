package com.example.carhouse.activity;
import android.graphics.Typeface;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.carhouse.R;
import com.example.carhouse.adapter.ViewPagerAdapter;
import com.example.carhouse.fragment.BuyerFragment;
import com.example.carhouse.fragment.MenuFragment;
import com.example.carhouse.fragment.SellerFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.Objects;

import butterknife.BindView;

public class DashboardActivity extends MainClass {

    @Nullable
    @BindView(R.id.tab_layout)
    TabLayout tabs = null;

    @Nullable
    @BindView(R.id.view_pager)
    ViewPager viewpager = null;

    @BindView(R.id.txtTitle)
    TextView txtTitle = null;

    @Nullable
    @BindView(R.id.toolbar)
    public Toolbar toolbar;

    @Nullable
    @BindView(R.id.lnrTitle)
    LinearLayout lnrTitle;

    boolean doublePressedOnce=false;


    @Override
    protected int getActivityLayout() {
        return R.layout.activity_dashboard;
    }

    @Override
    protected void intView() {
        setViewPager();
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

    public void setViewPager()
    {
        setupViewPager(viewpager);
        tabs.setupWithViewPager(viewpager);
        addTab(getString(R.string.buyer),0);
        addTab(getString(R.string.seller),1);
        addTab(getString(R.string.menu),2);

        tabs.setTabGravity(TabLayout.GRAVITY_FILL);

        viewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabs));
        viewpager.setOffscreenPageLimit(4);

        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(@NonNull TabLayout.Tab tab) {

                viewpager.setCurrentItem(tab.getPosition());
                int selectedTabPosition = viewpager.getCurrentItem();

                for (int i = 0; i < tabs.getTabCount(); i++)
                {
                    if (selectedTabPosition != i) {
                        View view = Objects.requireNonNull(tabs.getTabAt(i)).getCustomView();
                        if (view != null)
                        {
                            changeTextView(view, getResources().getColor(R.color.lightgrey), Typeface.NORMAL);
                        }
                    }
                }

                View tabview = Objects.requireNonNull(tabs.getTabAt(tab.getPosition())).getCustomView();

                changeTextView(tabview,getResources().getColor(R.color.darkblue), Typeface.BOLD);

                Fragment fragment = getSupportFragmentManager().findFragmentByTag("android:switcher:" + R.id.view_pager + ":" + viewpager.getCurrentItem());

                if (fragment != null)
                {
                    fragment.onResume();
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                //  viewPager.setCurrentItem(tab.getPosition());
                Fragment fragment = getSupportFragmentManager().findFragmentByTag("android:switcher:" + R.id.view_pager + ":" + viewpager.getCurrentItem());
                if (fragment != null) {
                    fragment.onPause();
                }

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }

        });

        View tabview = Objects.requireNonNull(tabs.getTabAt(0)).getCustomView();
        changeTextView(tabview,getResources().getColor(R.color.darkblue), Typeface.BOLD);

    }

    public void addTab(String tabtitle,int position)
    {
        try
        {
            View tabOne = LayoutInflater.from(this).inflate(R.layout.custom_tab, null);
            AppCompatTextView title = tabOne.findViewById(R.id.title);
            AppCompatImageView icon = tabOne.findViewById(R.id.icon);
            icon.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.ic_profile,null));
            title.setText(tabtitle);
//            title.setTypeface(customRegularFont);
            Objects.requireNonNull(tabs.getTabAt(position)).setCustomView(tabOne);
        }
        catch (Exception e)
        {
            Log.e("TAG",""+e.getMessage());
        }
    }

    private void setupViewPager(ViewPager viewPager)
    {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFrag(BuyerFragment.newInstance());
        viewPagerAdapter.addFrag(SellerFragment.newInstance());
        viewPagerAdapter.addFrag(MenuFragment.newInstance());
        viewPager.setOffscreenPageLimit(3);
        viewPager.setAdapter(viewPagerAdapter);
    }

    @Override
    public void onBackPressed()
    {
        if (doublePressedOnce)
        {
            super.onBackPressed();
            return;
        }

        this.doublePressedOnce = true;

        setToastMessage("Click back button again to exit");

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run() {
                doublePressedOnce = false;
            }
        }, 2000);
    }
}