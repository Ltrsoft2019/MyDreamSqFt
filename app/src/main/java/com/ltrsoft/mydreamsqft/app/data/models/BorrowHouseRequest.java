package com.ltrsoft.mydreamsqft.app.data.models;

public class BorrowHouseRequest {
    private int state_id;
    private int district_id;
    private int city_id;

    private String address;
    private String what_to_borrow;
    private String borrow_house_on;
    private String type;
    private String house_should_be;
    private String min_price;
    private String max_price;
    private String parking;
    private String lift;
    private String gallery;
    private String no_of_bathroom;
    private String no_of_toilet;
    private String borrow_duration;
    private String willing_to_give_deposit;
    private String total_person_staying;
    private String purpose_to_stay;
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

    public String getWhat_to_borrow() {
        return what_to_borrow;
    }

    public void setWhat_to_borrow(String what_to_borrow) {
        this.what_to_borrow = what_to_borrow;
    }

    public String getBorrow_house_on() {
        return borrow_house_on;
    }

    public void setBorrow_house_on(String borrow_house_on) {
        this.borrow_house_on = borrow_house_on;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHouse_should_be() {
        return house_should_be;
    }

    public void setHouse_should_be(String house_should_be) {
        this.house_should_be = house_should_be;
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

    public String getParking() {
        return parking;
    }

    public void setParking(String parking) {
        this.parking = parking;
    }

    public String getLift() {
        return lift;
    }

    public void setLift(String lift) {
        this.lift = lift;
    }

    public String getGallery() {
        return gallery;
    }

    public void setGallery(String gallery) {
        this.gallery = gallery;
    }

    public String getNo_of_bathroom() {
        return no_of_bathroom;
    }

    public void setNo_of_bathroom(String no_of_bathroom) {
        this.no_of_bathroom = no_of_bathroom;
    }

    public String getNo_of_toilet() {
        return no_of_toilet;
    }

    public void setNo_of_toilet(String no_of_toilet) {
        this.no_of_toilet = no_of_toilet;
    }

    public String getBorrow_duration() {
        return borrow_duration;
    }

    public void setBorrow_duration(String borrow_duration) {
        this.borrow_duration = borrow_duration;
    }

    public String getWilling_to_give_deposit() {
        return willing_to_give_deposit;
    }

    public void setWilling_to_give_deposit(String willing_to_give_deposit) {
        this.willing_to_give_deposit = willing_to_give_deposit;
    }

    public String getTotal_person_staying() {
        return total_person_staying;
    }

    public void setTotal_person_staying(String total_person_staying) {
        this.total_person_staying = total_person_staying;
    }

    public String getPurpose_to_stay() {
        return purpose_to_stay;
    }

    public void setPurpose_to_stay(String purpose_to_stay) {
        this.purpose_to_stay = purpose_to_stay;
    }

    public String getOther_details() {
        return other_details;
    }

    public void setOther_details(String other_details) {
        this.other_details = other_details;
    }
}
