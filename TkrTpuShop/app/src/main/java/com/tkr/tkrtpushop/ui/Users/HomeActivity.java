package com.tkr.tkrtpushop.ui.Users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.tkr.tkrtpushop.ui.LoginActivity;
import com.tkr.tkrtpushop.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public static class MainActivity extends AppCompatActivity {

        private Button joinButton, loginButton;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            joinButton = (Button) findViewById(R.id.main_join_btn);
            loginButton = (Button) findViewById(R.id.main_login_btn);

            loginButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent loginIntent = new Intent(MainActivity.this, LoginActivity.class);
                }
            });

        }
    }
}