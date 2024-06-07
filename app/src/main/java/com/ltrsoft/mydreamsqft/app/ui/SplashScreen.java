package com.ltrsoft.mydreamsqft.app.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;

import com.ltrsoft.mydreamsqft.app.util.BaseActivity;
import com.ltrsoft.mydreamsqft.databinding.ActivitySplashBinding;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class SplashScreen extends BaseActivity {
    private ActivitySplashBinding binding;
    private static final long SPLASH_DURATION = 1000;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashScreen.this,
                    LoginScreen.class);
            startActivity(intent);
            finish();
        }, SPLASH_DURATION);

    }
}
