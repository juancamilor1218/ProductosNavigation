package com.example.estebanjojoa.bottonnavigation.Login.interactor;

import com.example.estebanjojoa.bottonnavigation.Login.model.LoginModel;

import java.util.List;

public interface LoginActivityInteractor {
    void signIn(String user, String pass);
    void processData(List<LoginModel> loginList);
}
