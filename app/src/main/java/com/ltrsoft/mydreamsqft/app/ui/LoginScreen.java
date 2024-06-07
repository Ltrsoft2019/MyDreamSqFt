package com.ltrsoft.mydreamsqft.app.ui;

import static com.ltrsoft.mydreamsqft.app.util.Util.MOBILE;
import static com.ltrsoft.mydreamsqft.app.util.Util.TERM_AND_CONDITION;
import static com.ltrsoft.mydreamsqft.app.util.Util.VERIFICATION_ID;
import static com.ltrsoft.mydreamsqft.app.util.Util.isOnline;
import static com.ltrsoft.mydreamsqft.app.util.Util.showToast;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.firebase.FirebaseException;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import com.ltrsoft.mydreamsqft.app.util.BaseActivity;
import com.ltrsoft.mydreamsqft.app.util.ProgressDialog;
import com.ltrsoft.mydreamsqft.databinding.ActivityLoginBinding;

import java.util.concurrent.TimeUnit;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class LoginScreen extends BaseActivity {
    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.txtTermsAndCondition.setOnClickListener(v -> {
            if (isOnline(this)) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(TERM_AND_CONDITION));
                startActivity(browserIntent);
            } else showToast(LoginScreen.this, "Please check internet");
        });
        binding.btnSignIn.setOnClickListener(v -> {
            if (binding.edtMobileNumber.getText().toString().isEmpty()) {
                showToast(LoginScreen.this, "Please enter mobile number");
            } else if (binding.edtMobileNumber.getText().toString().trim().length() < 10) {
                showToast(LoginScreen.this, "Please enter valid mobile number");
            } else if (!isOnline(LoginScreen.this)) {
                showToast(LoginScreen.this, "Please check internet");
            } else {
                binding.btnSignIn.setClickable(false);
                ProgressDialog.getInstance().show(LoginScreen.this);
                phoneAuthProvider();
            }
        });
    }

    private void phoneAuthProvider() {
        PhoneAuthProvider.getInstance().verifyPhoneNumber("+91" + binding.edtMobileNumber.getText().toString(),
                60,
                TimeUnit.SECONDS,
                LoginScreen.this,
                new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {

                    @Override
                    public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {
                        binding.btnSignIn.setClickable(true);
                        ProgressDialog.getInstance().dismiss();
                    }

                    @Override
                    public void onVerificationFailed(@NonNull FirebaseException e) {
                        binding.btnSignIn.setClickable(true);
                        ProgressDialog.getInstance().dismiss();
                        showToast(LoginScreen.this, e.getMessage());
                    }

                    @Override
                    public void onCodeSent(@NonNull String verificationId, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
                        super.onCodeSent(verificationId, forceResendingToken);
                        binding.btnSignIn.setClickable(true);
                        ProgressDialog.getInstance().dismiss();
                        redirectToOtp(binding.edtMobileNumber.getText().toString().trim(), verificationId);
                    }
                }
        );
    }

    private void redirectToOtp(String mobileNumber, String verificationId) {
        Intent intent = new Intent(LoginScreen.this, OtpScreeen.class);
        intent.putExtra(MOBILE, mobileNumber);
        intent.putExtra(VERIFICATION_ID, verificationId);
        startActivity(intent);
        finish();
    }
}
