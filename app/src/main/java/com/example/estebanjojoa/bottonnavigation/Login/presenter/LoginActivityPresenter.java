package com.example.estebanjojoa.bottonnavigation.Login.presenter;

import com.example.estebanjojoa.bottonnavigation.Login.model.LoginModel;

import java.util.List;

public interface LoginActivityPresenter {
    void signIn(String user, String pass);
    void showResult(List<LoginModel> loginList);
    void showError(String error);
}
