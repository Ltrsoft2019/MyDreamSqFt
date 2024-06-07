package com.ltrsoft.mydreamsqft.app.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ltrsoft.mydreamsqft.databinding.ActivityOtpBinding;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class OtpScreeen extends AppCompatActivity {
    private ActivityOtpBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOtpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
