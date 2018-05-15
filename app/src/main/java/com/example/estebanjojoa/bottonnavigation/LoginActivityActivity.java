package com.example.estebanjojoa.bottonnavigation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivityActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        button = (Button) findViewById(R.id.Btn_Login);
    }

    public void Show_Login(View view){
        Intent intent = new Intent(LoginActivityActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
