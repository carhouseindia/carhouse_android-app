package com.example.carhouse.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.carhouse.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import butterknife.BindView;

public class LoginActivity extends MainClass {

    @BindView(R.id.imgClose)
    AppCompatImageView imgClose;

    @BindView(R.id.inputlayoutMob)
    TextInputLayout inputlayoutMob;

    @BindView(R.id.edtMobile)
    TextInputEditText edtMobile;

    @BindView(R.id.varifyBtn)
    AppCompatButton varifyBtn;

    @BindView(R.id.lnrWhatsApp)
    LinearLayout lnrWhatsApp;

    String mobileNumber;

    @Override
    protected int getActivityLayout() {
        return R.layout.activity_login;
    }

    @Override
    protected void intView() {

    }

    @Override
    protected void intLisener() {
        imgClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigator.navigateToDashboardScreen(LoginActivity.this);
            }
        });

        varifyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validate()){

                }
            }
        });

        lnrWhatsApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigator.navigateToOTPScreen(LoginActivity.this);
            }
        });


    }

    private boolean validate() {
        inputlayoutMob.setError("");
        if(edtMobile.getText().toString()!=null){
            if(edtMobile.getText().toString().length()==10){
                mobileNumber=edtMobile.getText().toString();
                return true;
            }else {
                inputlayoutMob.setError(getString(R.string.invalid_mob_num));
                return false;
            }
        }else {
            inputlayoutMob.setError(getString(R.string.enter_mob_num));
            return false;
        }
    }

    @Override
    protected void bindView(String Api, Object Responsedata) {

    }

    @Override
    protected void apiCall() {

    }
}