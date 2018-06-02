package com.example.estebanjojoa.bottonnavigation.ApiRest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Acer on 30/05/2018.
 */

public class RestApiAdapter {
    public Service getClientService(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(Service.class);
    }
}
