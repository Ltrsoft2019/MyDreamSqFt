package com.ltrsoft.mydreamsqft.app.data.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SubmitResponse {

    @SerializedName("message")
    @Expose
    private Boolean message;
    @SerializedName("response")
    @Expose
    private Response response;

    public Boolean getMessage() {
        return message;
    }

    public void setMessage(Boolean message) {
        this.message = message;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public class Response {

        @SerializedName("message")
        @Expose
        private String message;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

    }
}
