package com.ltrsoft.mydreamsqft.app.data.models;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class MyListingBuilderResponse {

    @SerializedName("message")
    @Expose
    private Boolean message;
    @SerializedName("response")
    @Expose
    private List<Response> response = null;

    public Boolean getMessage() {
        return message;
    }

    public void setMessage(Boolean message) {
        this.message = message;
    }

    public List<Response> getResponse() {
        return response;
    }

    public void setResponse(List<Response> response) {
        this.response = response;
    }

    public class Response {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("project_name")
        @Expose
        private String projectName;
        @SerializedName("address")
        @Expose
        private String address;
        @SerializedName("state_id")
        @Expose
        private String stateId;
        @SerializedName("pincode")
        @Expose
        private String pincode;
        @SerializedName("amenities")
        @Expose
        private String amenities;
        @SerializedName("what_to_sell")
        @Expose
        private String whatToSell;
        @SerializedName("state_name")
        @Expose
        private String stateName;
        @SerializedName("district_name")
        @Expose
        private String districtName;
        @SerializedName("city_name")
        @Expose
        private String cityName;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("posted_date")
        @Expose
        private String postedDate;

        public String getPostedDate() {
            return postedDate;
        }

        public void setPostedDate(String postedDate) {
            this.postedDate = postedDate;
        }
        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

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

        public String getAmenities() {
            return amenities;
        }

        public void setAmenities(String amenities) {
            this.amenities = amenities;
        }

        public String getWhatToSell() {
            return whatToSell;
        }

        public void setWhatToSell(String whatToSell) {
            this.whatToSell = whatToSell;
        }

        public String getStateName() {
            return stateName;
        }

        public void setStateName(String stateName) {
            this.stateName = stateName;
        }

        public String getDistrictName() {
            return districtName;
        }

        public void setDistrictName(String districtName) {
            this.districtName = districtName;
        }

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }
}
