package com.ltrsoft.mydreamsqft.app.data.network;


import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.AUTHORIZATION;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_AADHAR_CARD_NO;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_ADDRESS;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_AREA;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_ATTACHED_BATHROOM;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_BATHROOM;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_BUILDER_REGISTRATION_NUMBER;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_CARPET_AREA;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_CITY_ID;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_COMPANY_NAME;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_COMPLIANCE;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_DEVICE_ID;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_DIST_ID;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_DURATION;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_EAST_BOUNDARY;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_EMAIL;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_FLOOR_NO;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_GALLERY;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_HOUSE_SHOULD_BE;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_LAND_ON;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_LAND_UNDER;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_LEND_HOUSE_ON;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_LIFT;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_MAINTENANCE;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_MAX_DEPOSIT;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_MAX_PRICE;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_MIN_DEPOSIT;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_MIN_PRICE;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_NAME;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_NA_ORDER;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_NH;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_NORTH_BOUNDARY;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_OTHER_DETAILS;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_PARKING;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_PARKING_FOR;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_PARKING_IS;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_PINCODE;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_SANCTION_LAYOUT;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_SANCTION_LAYOUT_IS;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_SANCTION_LAYOUT_NO;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_SH;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_SOUTH_BOUNDARY;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_STATE_ID;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_TOILET;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_TOTAL_AREA;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_TOTAL_FLOOR;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_TYPE;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_USER_TYPE_ID;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_WEBSITE;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_WEST_BOUNDARY;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_WHAT_TO_LEND;
import static com.ltrsoft.mydreamsqft.app.util.ConstantAPI.KEY_WHAT_TO_SELL;

import com.google.gson.JsonObject;
import com.ltrsoft.mydreamsqft.app.data.models.BorrowHouseRequest;
import com.ltrsoft.mydreamsqft.app.data.models.BorrowLandRequest;
import com.ltrsoft.mydreamsqft.app.data.models.BuilderRequest;
import com.ltrsoft.mydreamsqft.app.data.models.BuyHouseRequest;
import com.ltrsoft.mydreamsqft.app.data.models.BuyLandRequest;
import com.ltrsoft.mydreamsqft.app.data.models.CreateProfileResponse;
import com.ltrsoft.mydreamsqft.app.data.models.DeleteRecordResponse;
import com.ltrsoft.mydreamsqft.app.data.models.GetProfileResponse;
import com.ltrsoft.mydreamsqft.app.data.models.GetResponse;
import com.ltrsoft.mydreamsqft.app.data.models.LoginResponse;
import com.ltrsoft.mydreamsqft.app.data.models.MyEnquiryResponse;
import com.ltrsoft.mydreamsqft.app.data.models.MyListingBuilderResponse;
import com.ltrsoft.mydreamsqft.app.data.models.MyListingResponse;
import com.ltrsoft.mydreamsqft.app.data.models.SubmitResponse;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;

public interface DreamSqFeetAPI {

    @Multipart
    @POST("register")
    Call<CreateProfileResponse> createProfile(@Header(AUTHORIZATION) String token,
                                              @Part(KEY_DEVICE_ID) RequestBody deviceId,
                                              @Part(KEY_STATE_ID) RequestBody stateId,
                                              @Part(KEY_DIST_ID) RequestBody distId,
                                              @Part(KEY_CITY_ID) RequestBody cityId,
                                              @Part(KEY_NAME) RequestBody name,
                                              @Part(KEY_EMAIL) RequestBody email,
                                              @Part(KEY_USER_TYPE_ID) RequestBody userTypeId,
                                              @Part(KEY_AADHAR_CARD_NO) RequestBody aadharCardNo,
                                              @Part(KEY_ADDRESS) RequestBody address,
                                              @Part(KEY_PINCODE) RequestBody pincode,
                                              @Part(KEY_WEBSITE) RequestBody website,
                                              @Part(KEY_COMPANY_NAME) RequestBody company,
                                              @Part(KEY_BUILDER_REGISTRATION_NUMBER) RequestBody registrationNumber,
                                              @Part MultipartBody.Part imgProfile);



    //Login
    @FormUrlEncoded
    @POST("login")
    Call<LoginResponse> login(@Field("phone") String phone,
                              @Field("app_type") String appType);

    //Get states
    @GET("states")
    Call<GetResponse> getStates();

    //Get dist
    @GET("districts/{stateId}")
    Call<GetResponse> getDist(@Path("stateId") int stateId);

    //Get City
    @GET("cities/{distId}")
    Call<GetResponse> getCities(@Path("distId") int distId);


    //Get profile
    @GET("getProfile")
    Call<GetProfileResponse> getProfile(@Header(AUTHORIZATION) String token);

    @Headers("Content-Type: application/json")
    @POST("house/buy")
    Call<SubmitResponse> submitHouseBuyEnquiry(@Header(AUTHORIZATION) String token,
                                               @Body BuyHouseRequest buyHouseRequest);


    @Headers("Content-Type: application/json")
    @POST("house/borrow")
    Call<SubmitResponse> submitHouseBorrowEnquiry(@Header(AUTHORIZATION) String token,
                                                  @Body BorrowHouseRequest borrowHouseRequest);

    @Multipart
    @POST("house/sell")
    Call<SubmitResponse> submitHouseSellEnquiry(@Header(AUTHORIZATION) String token,
                                                @Part(KEY_STATE_ID) RequestBody stateId,
                                                @Part(KEY_DIST_ID) RequestBody distId,
                                                @Part(KEY_CITY_ID) RequestBody cityId,
                                                @Part(KEY_ADDRESS) RequestBody address,
                                                @Part(KEY_WHAT_TO_SELL) RequestBody whatTo,
                                                @Part(KEY_TYPE) RequestBody propertyType,
                                                @Part(KEY_HOUSE_SHOULD_BE) RequestBody houseShouldBe,
                                                @Part(KEY_TOTAL_AREA) RequestBody totalArea,
                                                @Part(KEY_CARPET_AREA) RequestBody carpetArea,
                                                @Part(KEY_TOTAL_FLOOR) RequestBody totalFloor,
                                                @Part(KEY_FLOOR_NO) RequestBody floorNo,
                                                @Part(KEY_MIN_PRICE) RequestBody minPrice,
                                                @Part(KEY_MAX_PRICE) RequestBody maxPrice,
                                                @Part(KEY_PARKING) RequestBody parking,
                                                @Part(KEY_PARKING_FOR) RequestBody parkingFor,
                                                @Part(KEY_PARKING_IS) RequestBody parkingIs,
                                                @Part(KEY_LIFT) RequestBody lift,
                                                @Part(KEY_GALLERY) RequestBody gallery,
                                                @Part(KEY_BATHROOM) RequestBody noOfBath,
                                                @Part(KEY_TOILET) RequestBody noOfToilet,
                                                @Part(KEY_ATTACHED_BATHROOM) RequestBody noOfAttachBath,
                                                @Part(KEY_OTHER_DETAILS) RequestBody otherDetails,
                                                @Part MultipartBody.Part imgHall,
                                                @Part MultipartBody.Part imgKitchen,
                                                @Part MultipartBody.Part imgBedroom);


    @Multipart
    @POST("house/lend")
    Call<SubmitResponse> submitHouseLendEnquiry(@Header(AUTHORIZATION) String token,
                                                @Part(KEY_STATE_ID) RequestBody stateId,
                                                @Part(KEY_DIST_ID) RequestBody distId,
                                                @Part(KEY_CITY_ID) RequestBody cityId,
                                                @Part(KEY_ADDRESS) RequestBody address,
                                                @Part(KEY_LEND_HOUSE_ON) RequestBody houseOn,
                                                @Part(KEY_WHAT_TO_LEND) RequestBody whatTo,
                                                @Part(KEY_TYPE) RequestBody propertyType,
                                                @Part(KEY_HOUSE_SHOULD_BE) RequestBody houseShouldBe,
                                                @Part(KEY_TOTAL_AREA) RequestBody totalArea,
                                                @Part(KEY_CARPET_AREA) RequestBody carpetArea,
                                                @Part(KEY_TOTAL_FLOOR) RequestBody totalFloor,
                                                @Part(KEY_FLOOR_NO) RequestBody floorNo,
                                                @Part(KEY_MIN_PRICE) RequestBody minPrice,
                                                @Part(KEY_MAX_PRICE) RequestBody maxPrice,
                                                @Part(KEY_MIN_DEPOSIT) RequestBody minDeposit,
                                                @Part(KEY_MAX_DEPOSIT) RequestBody maxDeposit,
                                                @Part(KEY_PARKING) RequestBody parking,
                                                @Part(KEY_PARKING_FOR) RequestBody parkingFor,
                                                @Part(KEY_PARKING_IS) RequestBody parkingIs,
                                                @Part(KEY_LIFT) RequestBody lift,
                                                @Part(KEY_GALLERY) RequestBody gallery,
                                                @Part(KEY_BATHROOM) RequestBody noOfBath,
                                                @Part(KEY_TOILET) RequestBody noOfToilet,
                                                @Part(KEY_ATTACHED_BATHROOM) RequestBody noOfAttachBath,
                                                @Part(KEY_MAINTENANCE) RequestBody maintenance,
                                                @Part(KEY_OTHER_DETAILS) RequestBody otherDetails,
                                                @Part MultipartBody.Part imgHall,
                                                @Part MultipartBody.Part imgKitchen,
                                                @Part MultipartBody.Part imgBedroom);

    @Headers("Content-Type: application/json")
    @POST("land/buy")
    Call<SubmitResponse> submitLandBuyEnquiry(@Header(AUTHORIZATION) String token,
                                              @Body BuyLandRequest buyHouseRequest);


    @Headers("Content-Type: application/json")
    @POST("land/borrow")
    Call<SubmitResponse> submitLandBorrowEnquiry(@Header(AUTHORIZATION) String token,
                                                 @Body BorrowLandRequest borrowHouseRequest);


    @Multipart
    @POST("land/sell")
    Call<SubmitResponse> submitLandSellEnquiry(@Header(AUTHORIZATION) String token,
                                               @Part(KEY_STATE_ID) RequestBody stateId,
                                               @Part(KEY_DIST_ID) RequestBody distId,
                                               @Part(KEY_CITY_ID) RequestBody cityId,
                                               @Part(KEY_ADDRESS) RequestBody address,
                                               @Part(KEY_AREA) RequestBody area,
                                               @Part(KEY_MIN_PRICE) RequestBody minPrice,
                                               @Part(KEY_MAX_PRICE) RequestBody maxPrice,
                                               @Part(KEY_LAND_UNDER) RequestBody landUnder,
                                               @Part(KEY_NORTH_BOUNDARY) RequestBody northBoundary,
                                               @Part(KEY_EAST_BOUNDARY) RequestBody eastBoundary,
                                               @Part(KEY_WEST_BOUNDARY) RequestBody westBoundary,
                                               @Part(KEY_SOUTH_BOUNDARY) RequestBody southBoundary,
                                               @Part(KEY_SH) RequestBody fromSH,
                                               @Part(KEY_NH) RequestBody fromNH,
                                               @Part(KEY_SANCTION_LAYOUT) RequestBody sanctionLayout,
                                               @Part(KEY_SANCTION_LAYOUT_IS) RequestBody sanctionLayoutIs,
                                               @Part(KEY_SANCTION_LAYOUT_NO) RequestBody sanctionLayoutNo,
                                               @Part(KEY_NA_ORDER) RequestBody naOrder,
                                               @Part(KEY_COMPLIANCE) RequestBody anyLegalCompliance,
                                               @Part(KEY_OTHER_DETAILS) RequestBody otherDetails,
                                               @Part MultipartBody.Part img_7_12,
                                               @Part MultipartBody.Part img_8_A);


    @Multipart
    @POST("land/lend")
    Call<SubmitResponse> submitLandLendEnquiry(@Header(AUTHORIZATION) String token,
                                               @Part(KEY_STATE_ID) RequestBody stateId,
                                               @Part(KEY_DIST_ID) RequestBody distId,
                                               @Part(KEY_CITY_ID) RequestBody cityId,
                                               @Part(KEY_ADDRESS) RequestBody address,
                                               @Part(KEY_LAND_ON) RequestBody landOn,
                                               @Part(KEY_DURATION) RequestBody duration,
                                               @Part(KEY_AREA) RequestBody area,
                                               @Part(KEY_MIN_PRICE) RequestBody minPrice,
                                               @Part(KEY_MAX_PRICE) RequestBody maxPrice,
                                               @Part(KEY_LAND_UNDER) RequestBody landUnder,
                                               @Part(KEY_NORTH_BOUNDARY) RequestBody northBoundary,
                                               @Part(KEY_EAST_BOUNDARY) RequestBody eastBoundary,
                                               @Part(KEY_WEST_BOUNDARY) RequestBody westBoundary,
                                               @Part(KEY_SOUTH_BOUNDARY) RequestBody southBoundary,
                                               @Part(KEY_SH) RequestBody fromSH,
                                               @Part(KEY_NH) RequestBody fromNH,
                                               @Part(KEY_SANCTION_LAYOUT) RequestBody sanctionLayout,
                                               @Part(KEY_SANCTION_LAYOUT_IS) RequestBody sanctionLayoutIs,
                                               @Part(KEY_SANCTION_LAYOUT_NO) RequestBody sanctionLayoutNo,
                                               @Part(KEY_NA_ORDER) RequestBody naOrder,
                                               @Part(KEY_COMPLIANCE) RequestBody anyLegalCompliance,
                                               @Part(KEY_OTHER_DETAILS) RequestBody otherDetails,
                                               @Part MultipartBody.Part img_7_12,
                                               @Part MultipartBody.Part img_8_A);

    //Get Enquiries
    @GET("getMyEnquiries")
    Call<MyEnquiryResponse> getMyEnquiries(@Header(AUTHORIZATION) String token);

    //Get My Listing
    @GET("getMyListing")
    Call<MyListingResponse> getMyList(@Header(AUTHORIZATION) String token);

    //Get My Listing Builder
    @GET("house/get-multiple")
    Call<MyListingBuilderResponse> getMyListBuilder(@Header(AUTHORIZATION) String token);


    @POST("house/delete_buy/{enquiryId}")
    Call<DeleteRecordResponse> deleteHouseBuy(@Header(AUTHORIZATION) String token,
                                              @Path("enquiryId") String enquiryId);


    @POST("house/delete_sell/{enquiryId}")
    Call<DeleteRecordResponse> deleteHouseSell(@Header(AUTHORIZATION) String token,
                                               @Path("enquiryId") String enquiryId);


    @POST("house/delete_borrow/{enquiryId}")
    Call<DeleteRecordResponse> deleteHouseBorrow(@Header(AUTHORIZATION) String token,
                                                 @Path("enquiryId") String enquiryId);


    @POST("house/delete_lend/{enquiryId}")
    Call<DeleteRecordResponse> deleteHouseLend(@Header(AUTHORIZATION) String token,
                                               @Path("enquiryId") String enquiryId);


    @POST("land/delete_buy/{enquiryId}")
    Call<DeleteRecordResponse> deleteLandBuy(@Header(AUTHORIZATION) String token,
                                             @Path("enquiryId") String enquiryId);


    @POST("land/delete_sell/{enquiryId}")
    Call<DeleteRecordResponse> deleteLandSell(@Header(AUTHORIZATION) String token,
                                              @Path("enquiryId") String enquiryId);


    @POST("land/delete_borrow/{enquiryId}")
    Call<DeleteRecordResponse> deleteLandBorrow(@Header(AUTHORIZATION) String token,
                                                @Path("enquiryId") String enquiryId);


    @POST("land/delete_lend/{enquiryId}")
    Call<DeleteRecordResponse> deleteLandLend(@Header(AUTHORIZATION) String token,
                                              @Path("enquiryId") String enquiryId);

    @Headers("Content-Type: application/json")
    @POST("house/sell-multiple")
    Call<SubmitResponse> submitBuilderEnquiry(@Header(AUTHORIZATION) String token,
                                              @Body BuilderRequest builderRequest);


}
