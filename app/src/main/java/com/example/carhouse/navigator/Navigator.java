package com.example.carhouse.navigator;

import android.app.Activity;
import android.content.Intent;

import androidx.annotation.NonNull;

import com.example.carhouse.activity.DashboardActivity;
import com.example.carhouse.activity.LoginActivity;
import com.example.carhouse.activity.OTPActivity;
import com.example.carhouse.activity.SearchActivity;
import com.example.carhouse.activity.SellCarCreateActivity;

public class Navigator {

    public void navigateToLoginScreen(@NonNull Activity context) {
        Intent intent = new Intent(context, LoginActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    public void navigateToDashboardScreen(@NonNull Activity context) {
        Intent intent = new Intent(context, DashboardActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
    public void navigateToSellerCreateScreen(@NonNull Activity context) {
        Intent intent = new Intent(context, SellCarCreateActivity.class);
        context.startActivity(intent);
    }
    public void navigateToOTPScreen(@NonNull Activity context) {
        Intent intent = new Intent(context, OTPActivity.class);
        context.startActivity(intent);
    }
    public void navigateToSearchActivity(@NonNull Activity context) {
        Intent intent = new Intent(context, SearchActivity.class);
        context.startActivity(intent);
    }
}
