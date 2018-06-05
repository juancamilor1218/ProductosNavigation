package com.example.estebanjojoa.bottonnavigation.Login.presenter;

import com.example.estebanjojoa.bottonnavigation.Login.interactor.LoginActivityInteractor;
import com.example.estebanjojoa.bottonnavigation.Login.interactor.LoginActivityInteractorImpl;
import com.example.estebanjojoa.bottonnavigation.Login.model.LoginModel;
import com.example.estebanjojoa.bottonnavigation.Login.view.LoginView;

import java.util.List;

public class LoginAcitivityPresenterImpl implements LoginActivityPresenter {
    private LoginView loginActivityView;
    private LoginActivityInteractor loginActivityInteractor;

    public LoginAcitivityPresenterImpl(LoginView loginActivityView) {
        this.loginActivityView = loginActivityView;
        loginActivityInteractor= new LoginActivityInteractorImpl(this);
    }

    @Override
    public void signIn(String user, String pass) {
        loginActivityInteractor.signIn(user, pass);
    }

    @Override
    public void showResult(List<LoginModel> loginList) {
        loginActivityView.showResult(loginList);
    }

    @Override
    public void showError(String error) {
        loginActivityView.showError(error);
    }
}
