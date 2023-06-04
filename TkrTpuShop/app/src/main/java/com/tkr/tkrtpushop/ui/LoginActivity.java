package com.tkr.tkrtpushop.ui;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.tkr.tkrtpushop.R;

public class LoginActivity extends AppCompatActivity
{
    private Button loginButton;
    private EditText loginPhoneInput, loginPasswordInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginButton = (Button)findViewById(R.id.login_btn);
        loginPhoneInput = (EditText)findViewById(R.id.Login_phone_input);
        loginPasswordInput = (EditText)findViewById(R.id.Login_password_input);


    }



}
