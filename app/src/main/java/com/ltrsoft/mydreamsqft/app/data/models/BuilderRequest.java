package com.ltrsoft.mydreamsqft.app.data.models;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class BuilderRequest {

    @SerializedName("project_name")
    @Expose
    private String projectName;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("state_id")
    @Expose
    private Integer stateId;
    @SerializedName("district_id")
    @Expose
    private Integer districtId;
    @SerializedName("pincode")
    @Expose
    private String pincode;
    @SerializedName("city_id")
    @Expose
    private Integer cityId;
    @SerializedName("amenities")
    @Expose
    private List<String> amenities = null;
    @SerializedName("what_to_sell")
    @Expose
    private List<String> whatToSell = null;
    @SerializedName("House")
    @Expose
    private JsonObject house;
    @SerializedName("Flat")
    @Expose
    private JsonObject flat;
    @SerializedName("RowHouse")
    @Expose
    private JsonObject rowHouse;

    @SerializedName("Shop")
    @Expose
    private JsonObject shop;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public List<String> getAmenities() {
        return amenities;
    }

    public void setAmenities(List<String> amenities) {
        this.amenities = amenities;
    }

    public List<String> getWhatToSell() {
        return whatToSell;
    }

    public void setWhatToSell(List<String> whatToSell) {
        this.whatToSell = whatToSell;
    }

    public JsonObject getHouse() {
        return house;
    }

    public void setHouse(JsonObject house) {
        this.house = house;
    }

    public JsonObject getFlat() {
        return flat;
    }

    public void setFlat(JsonObject flat) {
        this.flat = flat;
    }

    public JsonObject getRowHouse() {
        return rowHouse;
    }

    public void setRowHouse(JsonObject rowHouse) {
        this.rowHouse = rowHouse;
    }

    public JsonObject getShop() {
        return shop;
    }

    public void setShop(JsonObject shop) {
        this.shop = shop;
    }


}
