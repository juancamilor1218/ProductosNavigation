package com.example.estebanjojoa.bottonnavigation.Login.view;

import com.example.estebanjojoa.bottonnavigation.Login.model.LoginModel;

import java.util.List;

public interface LoginView {
    void showResult(List<LoginModel> loginList);
    void showError(String error);
}
