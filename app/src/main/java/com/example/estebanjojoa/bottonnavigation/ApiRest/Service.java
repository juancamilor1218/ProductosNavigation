package com.example.estebanjojoa.bottonnavigation.ApiRest;

import com.example.estebanjojoa.bottonnavigation.Login.model.LoginModel;
import com.example.estebanjojoa.bottonnavigation.Products.model.Product;
import com.example.estebanjojoa.bottonnavigation.Supermarket.model.Supermarket;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Acer on 30/05/2018.
 */

public interface Service {

    @GET(Constants.URL_PRODUCTS)
    Call<List<Product>> getDataProducts();

    @GET(Constants.URL_COMPANY)
    Call<List<Supermarket>> getDataCompany();

    @POST(Constants.URL_LOGIN)
    @FormUrlEncoded
    Call<List<LoginModel>> onSignIn(@Field("username") String user, @Field("pass") String pass);


}
