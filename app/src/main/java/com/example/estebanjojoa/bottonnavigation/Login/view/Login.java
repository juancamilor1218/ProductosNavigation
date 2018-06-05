package com.example.estebanjojoa.bottonnavigation.Login.view;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.estebanjojoa.bottonnavigation.Home.view.MainActivity;
import com.example.estebanjojoa.bottonnavigation.Login.model.LoginModel;
import com.example.estebanjojoa.bottonnavigation.Login.presenter.LoginAcitivityPresenterImpl;
import com.example.estebanjojoa.bottonnavigation.Login.presenter.LoginActivityPresenter;
import com.example.estebanjojoa.bottonnavigation.R;

import java.util.List;

public class Login extends AppCompatActivity implements LoginView{

    private LoginActivityPresenter loginActivityPresenter;
    SharedPreferences sharedPreferences;
    EditText editTextUser, editTextPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginActivityPresenter = new LoginAcitivityPresenterImpl(this);
        editTextUser=(EditText)findViewById(R.id.id_et_usuario);
        editTextPass=(EditText)findViewById(R.id.id_et_contraseña);


    }

    public void OnClickButon(View view){
        loginActivityPresenter.signIn(editTextUser.getText().toString(),editTextPass.getText().toString());
    }

    @Override
    public void showResult(List<LoginModel> loginList) {
        sharedPreferences= getSharedPreferences("PreferencesLogin", Context.MODE_PRIVATE);
        SharedPreferences.Editor
                editor = sharedPreferences.edit();
        editor.putString("email", loginList.get(0).getEmail());
        editor.putString("name", loginList.get(0).getName());
        editor.putString("user", loginList.get(0).getUsername());
        editor.putString("img", loginList.get(0).getEmail());
        editor.commit();
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

    @Override
    public void showError(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }
}
