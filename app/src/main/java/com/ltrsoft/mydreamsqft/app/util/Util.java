package com.ltrsoft.mydreamsqft.app.util;

import android.Manifest;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

import dagger.hilt.android.qualifiers.ApplicationContext;

public class Util {

    public static String TERM_AND_CONDITION = "https://ltr-soft.com/dreamsqft/tnc";
    public static String MOBILE = "Mobile";
    public static String VERIFIED_NUMBER = "Verified_No";
    public static String VERIFICATION_ID = "verificationId";
    public static String IS_LOGGED_IN = "isLoggedIn";
    public static String DASHBOARD = "Realtor Board";
    public static String TOKEN = "token";
    public static String UNIQUE_ID = "unique_id";
    public static String STATUS = "status";
    public static int USER_TYPE = 1; // 1 = Customer and 3 = Builder
    public static String USER_TYPE_ID = "user_type_id"; // 1 = Customer and 3 = Builder

    public static final String APP_TYPE = "1";


    //Property variables
    public static int LOOKING_FOR = 0;
    public static int TRANSACTION_TYPE = 0;

    public static final int PICK_IMAGE_CAMERA = 1, PICK_IMAGE_GALLERY = 2;


    public static final int MY_CAMERA_REQUEST_CODE = 100;
    public static final int REQUEST_EXTERNAL_STORAGE = 101;

    // Storage Permissions
    public static final String[] PERMISSIONS_STORAGE = {
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
    };

    public static boolean isOnline(Context context) {
        if (context != null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo activeNetworkInfo = null;
            if (connectivityManager != null) {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            }
            return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
        }
        return false;
    }

    public static void showToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
