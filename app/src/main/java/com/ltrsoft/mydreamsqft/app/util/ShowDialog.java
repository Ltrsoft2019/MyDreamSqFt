package com.ltrsoft.mydreamsqft.app.util;

import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Build;
import android.view.Window;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.content.ContextCompat;


import com.ltrsoft.mydreamsqft.R;
import com.ltrsoft.mydreamsqft.app.data.models.GetResponse;
import com.ltrsoft.mydreamsqft.app.util.Interface.OptionSelectedItemListener;
import com.ltrsoft.mydreamsqft.app.util.Interface.TaskComplete;

import java.util.List;

public class ShowDialog {

    private static ShowDialog mInstance;

    public static synchronized ShowDialog getInstance() {
        if (mInstance == null) {
            mInstance = new ShowDialog();
        }
        return mInstance;
    }

    // Address related dialog
    public void showDialog(Context context, List<GetResponse.Response> list, String dialogType, OptionSelectedItemListener listener) {

        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(true);
        dialog.setContentView(R.layout.dialog_state);
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        dialog.show();
        RadioGroup rdoGrpState = dialog.findViewById(R.id.rdoGrpState);
        TextView txtHeading = dialog.findViewById(R.id.txtHeading);

        if (dialogType.equalsIgnoreCase("State")) {
            txtHeading.setText("Select State");
        } else if (dialogType.equalsIgnoreCase("Dist")) {
            txtHeading.setText("Select District");
        } else {
            txtHeading.setText("Select City");
        }

        final AppCompatRadioButton[] rb = new AppCompatRadioButton[list.size()];
        for (int i = 0; i < list.size(); i++) {
            rb[i] = new AppCompatRadioButton(context);
            rb[i].setText(" " + list.get(i).getName());
            rb[i].setId(list.get(i).getId());
            setButtonAttribute(context, rb[i]);
            rdoGrpState.addView(rb[i]);
        }


//        rdoGrpState.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                RadioButton radioButton = (RadioButton) group.findViewById(checkedId);
//                String strText = radioButton.getText().toString().trim();
//                if (dialogType.equalsIgnoreCase("State")) {
//                    ((BaseActivity) context).callGetDistAPI(context, new TaskComplete() {
//                        @Override
//                        public void onTaskFinished(List<GetResponse.Response> response) {
////                            listener.onOptionOptionSelected(checkedId, strText,response);
//
//                        }
//                    }, checkedId);
//                } else if (dialogType.equalsIgnoreCase("Dist")) {
//                    ((BaseActivity) context).callGetCitiesAPI(context, new TaskComplete() {
//                        @Override
//                        public void onTaskFinished(List<GetResponse.Response> response) {
////                            listener.onOptionOptionSelected(checkedId, strText, response);
//                        }
//                    }, checkedId);
//                } else {
//                    listener.onOptionOptionSelected(checkedId, strText, null);
//                }
//
//                dialog.dismiss();
//            }
//        });
    }

    private void setButtonAttribute(Context context, AppCompatRadioButton radioButton) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            radioButton.setTextColor(ContextCompat.getColor(context, R.color.purple_dark));
            ColorStateList colorStateList = new ColorStateList(
                    new int[][]{
                            new int[]{-android.R.attr.state_checked},
                            new int[]{android.R.attr.state_checked}
                    },
                    new int[]{
                            ContextCompat.getColor(context, R.color.purple_dark)
                            , ContextCompat.getColor(context, R.color.purple_dark),
                    }
            );
            radioButton.setButtonTintList(colorStateList);
        } else {
            radioButton.setTextColor(context.getResources().getColor(R.color.purple_dark));
            ColorStateList colorStateList = new ColorStateList(
                    new int[][]{
                            new int[]{-android.R.attr.state_checked},
                            new int[]{android.R.attr.state_checked}
                    },
                    new int[]{
                            context.getResources().getColor(R.color.purple_dark)
                            , context.getResources().getColor(R.color.purple_dark),
                    }
            );
            radioButton.setButtonTintList(colorStateList);
        }

    }


}
