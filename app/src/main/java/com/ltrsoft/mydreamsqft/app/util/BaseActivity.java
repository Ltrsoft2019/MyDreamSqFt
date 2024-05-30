package com.ltrsoft.mydreamsqft.app.util;
import static com.ltrsoft.mydreamsqft.app.util.Util.STATUS;
import static com.ltrsoft.mydreamsqft.app.util.Util.TOKEN;
import static com.ltrsoft.mydreamsqft.app.util.Util.VERIFIED_NUMBER;
import static com.ltrsoft.mydreamsqft.app.util.Util.isOnline;
import static com.ltrsoft.mydreamsqft.app.util.Util.showToast;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.ltrsoft.mydreamsqft.app.data.models.GetResponse;
import com.ltrsoft.mydreamsqft.app.util.Interface.TaskComplete;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BaseActivity extends AppCompatActivity {

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

    public String getToken(Context context) {
        return " Bearer " + SharedPreferencesManager.getInstance(context).getString(TOKEN, "");
    }

    public int getStatus(Context context) {
        return SharedPreferencesManager.getInstance(context).getInteger(STATUS, 0);
    }

    public String getMobileNumber(Context context) {
        return SharedPreferencesManager.getInstance(context).getString(VERIFIED_NUMBER, "");
    }


    public void callGetStateAPI(Context context, TaskComplete taskComplete) {
        if (!isOnline(context)) {
            showToast(context, "Please check internet connection!!!");
            return;
        }
        ProgressDialog.getInstance().show(context);
        Call<GetResponse> call = null;
//                = RetrofitClient.getInstance().
//                getApi().
//                getStates();

        call.enqueue(new Callback<GetResponse>() {
            @Override
            public void onResponse(Call<GetResponse> call, Response<GetResponse> response) {
                if (response.body().getMessage()) {
                    taskComplete.onTaskFinished(response.body().getResponse());
                }
                ProgressDialog.getInstance().dismiss();
            }

            @Override
            public void onFailure(Call<GetResponse> call, Throwable t) {
                ProgressDialog.getInstance().dismiss();
                Toast.makeText(context, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }


    public void callGetDistAPI(Context context, TaskComplete taskComplete, int id) {
        if (!isOnline(context)) {
            showToast(context, "Please check internet connection!!!");
            return;
        }
        ProgressDialog.getInstance().show(context);
        Call<GetResponse> call = null;
//                RetrofitClient.getInstance().
//                getApi().
//                getDist(id);

        call.enqueue(new Callback<GetResponse>() {
            @Override
            public void onResponse(Call<GetResponse> call, Response<GetResponse> response) {
                if (response.body().getMessage()) {
                    taskComplete.onTaskFinished(response.body().getResponse());
                }
                ProgressDialog.getInstance().dismiss();
            }

            @Override
            public void onFailure(Call<GetResponse> call, Throwable t) {
                ProgressDialog.getInstance().dismiss();
                Toast.makeText(context, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void callGetCitiesAPI(Context context, TaskComplete taskComplete, int id) {
        if (!isOnline(context)) {
            showToast(context, "Please check internet connection!!!");
            return;
        }
        ProgressDialog.getInstance().show(context);
        Call<GetResponse> call = null;
//                RetrofitClient.getInstance().
//                getApi().
//                getCities(id);

        call.enqueue(new Callback<GetResponse>() {
            @Override
            public void onResponse(Call<GetResponse> call, Response<GetResponse> response) {
                if (response.body().getMessage()) {
                    taskComplete.onTaskFinished(response.body().getResponse());
                }
                ProgressDialog.getInstance().dismiss();
            }

            @Override
            public void onFailure(Call<GetResponse> call, Throwable t) {
                ProgressDialog.getInstance().dismiss();
                Toast.makeText(context, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
