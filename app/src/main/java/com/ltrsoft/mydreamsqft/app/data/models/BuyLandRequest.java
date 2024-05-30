package com.ltrsoft.mydreamsqft.app.data.models;

public class BuyLandRequest {

    private int state_id;
    private int district_id;
    private int city_id;

    private String address;
    private String buy_land_as;
    private String expected_area_sqft;
    private String purpose;
    private String min_price;
    private String max_price;
    private String other_details;


    public int getState_id() {
        return state_id;
    }

    public void setState_id(int state_id) {
        this.state_id = state_id;
    }

    public int getDistrict_id() {
        return district_id;
    }

    public void setDistrict_id(int district_id) {
        this.district_id = district_id;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBuy_land_as() {
        return buy_land_as;
    }

    public void setBuy_land_as(String buy_land_as) {
        this.buy_land_as = buy_land_as;
    }

    public String getExpected_area_sqft() {
        return expected_area_sqft;
    }

    public void setExpected_area_sqft(String expected_area_sqft) {
        this.expected_area_sqft = expected_area_sqft;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getMin_price() {
        return min_price;
    }

    public void setMin_price(String min_price) {
        this.min_price = min_price;
    }

    public String getMax_price() {
        return max_price;
    }

    public void setMax_price(String max_price) {
        this.max_price = max_price;
    }

    public String getOther_details() {
        return other_details;
    }

    public void setOther_details(String other_details) {
        this.other_details = other_details;
    }
}
