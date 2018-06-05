package com.example.estebanjojoa.bottonnavigation.Login.interactor;

import com.example.estebanjojoa.bottonnavigation.Login.model.LoginModel;
import com.example.estebanjojoa.bottonnavigation.Login.presenter.LoginActivityPresenter;
import com.example.estebanjojoa.bottonnavigation.Login.repository.LoginActivityRepository;
import com.example.estebanjojoa.bottonnavigation.Login.repository.LoginActivityRepositoryImpl;

import java.util.List;

public class LoginActivityInteractorImpl implements LoginActivityInteractor {

    private LoginActivityPresenter loginActivityPresenter;
    private LoginActivityRepository loginActivityRepository;
    @Override
    public void signIn(String user, String pass) {
        if ("".equals(user) || "".equals(pass)){
            loginActivityPresenter.showError("Los campos no pueden estar vacios");
        }else {
            loginActivityRepository.signIn(user, pass);
        }
    }

    public LoginActivityInteractorImpl(LoginActivityPresenter loginActivityPresenter) {
        this.loginActivityPresenter = loginActivityPresenter;
        loginActivityRepository= new LoginActivityRepositoryImpl(this);
    }

    @Override
    public void processData(List<LoginModel> loginList) {

    }
}
