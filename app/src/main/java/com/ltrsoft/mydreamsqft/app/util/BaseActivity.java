package com.ltrsoft.mydreamsqft.app.util;

import static com.ltrsoft.mydreamsqft.app.util.Util.STATUS;
import static com.ltrsoft.mydreamsqft.app.util.Util.TOKEN;
import static com.ltrsoft.mydreamsqft.app.util.Util.VERIFIED_NUMBER;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class BaseActivity extends AppCompatActivity {
    @Inject
    SharedPreferencesManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hideToolbar();
    }
    private void hideToolbar() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }

    public static boolean isValidEmail(String email) {
        return !TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    public String getToken() {
        return " Bearer " + manager.getString(TOKEN, "");
    }

    public int getStatus() {
        return manager.getInteger(STATUS, 0);
    }

    public String getMobileNumber() {
        return manager.getString(VERIFIED_NUMBER, "");
    }

}
