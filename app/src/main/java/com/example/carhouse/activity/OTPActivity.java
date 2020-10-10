package com.example.carhouse.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.carhouse.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import butterknife.BindView;

public class OTPActivity extends MainClass {

    @BindView(R.id.lnrBack)
    LinearLayout lnrBack;

    @BindView(R.id.inputlayoutOTP)
    TextInputLayout inputlayoutOTP;

    @BindView(R.id.edtOTP)
    TextInputEditText edtOTP;

    @BindView(R.id.txtMobileNumber)
    AppCompatTextView txtMobileNumber;

    @BindView(R.id.txtCancel)
    AppCompatTextView txtCancel;

    @BindView(R.id.btnLogin)
    AppCompatButton btnLogin;

    String mobileNumber;

    @Override
    protected int getActivityLayout() {
        return R.layout.activity_otp;
    }

    @Override
    protected void intView() {

    }

    @Override
    protected void intLisener() {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigator.navigateToDashboardScreen(OTPActivity.this);
            }
        });
    }

    @Override
    protected void bindView(String Api, Object Responsedata) {

    }

    @Override
    protected void apiCall() {

    }
}