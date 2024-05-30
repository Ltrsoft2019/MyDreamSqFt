package com.ltrsoft.mydreamsqft.app.util.Interface;


import com.ltrsoft.mydreamsqft.app.data.models.GetResponse;

import java.util.List;

public interface OptionSelectedItemListener {

    void onOptionOptionSelected(int checkedId, String checkedText, List<GetResponse.Response> response);
}
