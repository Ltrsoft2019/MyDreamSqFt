package com.ltrsoft.mydreamsqft.app.util.Interface;


import com.ltrsoft.mydreamsqft.app.data.models.GetResponse;

import java.util.List;

public interface TaskComplete {
    void onTaskFinished(List<GetResponse.Response> response);
}
