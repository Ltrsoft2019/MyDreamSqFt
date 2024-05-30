package com.ltrsoft.mydreamsqft.app.data.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LoginResponse {

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

        @SerializedName("token")
        @Expose
        private String token;
        @SerializedName("status")
        @Expose
        private Integer status;
        @SerializedName("customer_data")
        @Expose
        private List<CustomerDatum> customerData = null;
        @SerializedName("error_message")
        @Expose
        private String errorMessage;

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public List<CustomerDatum> getCustomerData() {
            return customerData;
        }

        public void setCustomerData(List<CustomerDatum> customerData) {
            this.customerData = customerData;
        }

        public String getErrorMessage() {
            return errorMessage;
        }

        public void setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
        }

    }

    public class CustomerDatum {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("code")
        @Expose
        private String code;
        @SerializedName("user_id")
        @Expose
        private String userId;
        @SerializedName("devide_id")
        @Expose
        private String devideId;
        @SerializedName("phone")
        @Expose
        private String phone;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("address")
        @Expose
        private String address;
        @SerializedName("city_id")
        @Expose
        private String cityId;
        @SerializedName("district_id")
        @Expose
        private String districtId;
        @SerializedName("state_id")
        @Expose
        private String stateId;
        @SerializedName("pincode")
        @Expose
        private String pincode;
        @SerializedName("user_type_id")
        @Expose
        private String userTypeId;
        @SerializedName("aadhar_no")
        @Expose
        private String aadharNo;
        @SerializedName("builder_registration_number")
        @Expose
        private String builderRegistrationNumber;
        @SerializedName("website")
        @Expose
        private String website;
        @SerializedName("created_at")
        @Expose
        private String createdAt;
        @SerializedName("updated_at")
        @Expose
        private String updatedAt;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getDevideId() {
            return devideId;
        }

        public void setDevideId(String devideId) {
            this.devideId = devideId;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getCityId() {
            return cityId;
        }

        public void setCityId(String cityId) {
            this.cityId = cityId;
        }

        public String getDistrictId() {
            return districtId;
        }

        public void setDistrictId(String districtId) {
            this.districtId = districtId;
        }

        public String getStateId() {
            return stateId;
        }

        public void setStateId(String stateId) {
            this.stateId = stateId;
        }

        public String getPincode() {
            return pincode;
        }

        public void setPincode(String pincode) {
            this.pincode = pincode;
        }

        public String getUserTypeId() {
            return userTypeId;
        }

        public void setUserTypeId(String userTypeId) {
            this.userTypeId = userTypeId;
        }

        public String getAadharNo() {
            return aadharNo;
        }

        public void setAadharNo(String aadharNo) {
            this.aadharNo = aadharNo;
        }

        public String getBuilderRegistrationNumber() {
            return builderRegistrationNumber;
        }

        public void setBuilderRegistrationNumber(String builderRegistrationNumber) {
            this.builderRegistrationNumber = builderRegistrationNumber;
        }

        public String getWebsite() {
            return website;
        }

        public void setWebsite(String website) {
            this.website = website;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

    }
}
