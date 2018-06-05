package com.example.estebanjojoa.bottonnavigation.Login.repository;

import com.example.estebanjojoa.bottonnavigation.ApiRest.RestApiAdapter;
import com.example.estebanjojoa.bottonnavigation.ApiRest.Service;
import com.example.estebanjojoa.bottonnavigation.Login.interactor.LoginActivityInteractor;
import com.example.estebanjojoa.bottonnavigation.Login.model.LoginModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivityRepositoryImpl implements LoginActivityRepository {
    private LoginActivityInteractor loginActivityInteractor;
    List<LoginModel> loginList;

    public LoginActivityRepositoryImpl(LoginActivityInteractor loginActivityInteractor) {
        this.loginActivityInteractor = loginActivityInteractor;
    }

    @Override
    public void signIn(String user, String pass) {
        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Service service = restApiAdapter.getClientService();
        service.onSignIn(user, pass).enqueue(new Callback<List<LoginModel>>() {
            @Override
            public void onResponse(Call<List<LoginModel>> call, Response<List<LoginModel>> response) {
                loginList = response.body();
                loginActivityInteractor.processData(loginList);
            }

            @Override
            public void onFailure(Call<List<LoginModel>> call, Throwable t) {

            }
        });
    }
}
