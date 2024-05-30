package com.ltrsoft.mydreamsqft.app.data.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MyListingResponse {

    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("data")
    @Expose
    private List<Datum> data = null;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public class Datum {

        @SerializedName("property_type")
        @Expose
        private String propertyType;
        @SerializedName("enquiry_id")
        @Expose
        private String enquiryId;
        @SerializedName("property_for")
        @Expose
        private String propertyFor;
        @SerializedName("address")
        @Expose
        private String address;
        @SerializedName("city")
        @Expose
        private String city;
        @SerializedName("what_to")
        @Expose
        private String whatTo;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("house_should_be")
        @Expose
        private String houseShouldBe;
        @SerializedName("min_price")
        @Expose
        private String minPrice;
        @SerializedName("max_price")
        @Expose
        private String maxPrice;
        @SerializedName("date")
        @Expose
        private String date;
        @SerializedName("area")
        @Expose
        private String area;
        @SerializedName("buy_land_as")
        @Expose
        private String buyLandAs;

        public String getPropertyType() {
            return propertyType;
        }

        public void setPropertyType(String propertyType) {
            this.propertyType = propertyType;
        }

        public String getPropertyFor() {
            return propertyFor;
        }

        public void setPropertyFor(String propertyFor) {
            this.propertyFor = propertyFor;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getWhatTo() {
            return whatTo;
        }

        public void setWhatTo(String whatTo) {
            this.whatTo = whatTo;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getHouseShouldBe() {
            return houseShouldBe;
        }

        public void setHouseShouldBe(String houseShouldBe) {
            this.houseShouldBe = houseShouldBe;
        }

        public String getMinPrice() {
            return minPrice;
        }

        public void setMinPrice(String minPrice) {
            this.minPrice = minPrice;
        }

        public String getMaxPrice() {
            return maxPrice;
        }

        public void setMaxPrice(String maxPrice) {
            this.maxPrice = maxPrice;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getBuyLandAs() {
            return buyLandAs;
        }

        public void setBuyLandAs(String buyLandAs) {
            this.buyLandAs = buyLandAs;
        }

        public String getEnquiryId() {
            return enquiryId;
        }

        public void setEnquiryId(String enquiryId) {
            this.enquiryId = enquiryId;
        }
    }
}