package com.tkr.tkrtpushop.Users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.tkr.tkrtpushop.MainActivity;
import com.tkr.tkrtpushop.R;

public class HomeActivity extends AppCompatActivity {
    private Button logoutBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        logoutBtn = (Button)findViewById(R.id.button);

        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logoutIntent = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(logoutIntent);
            }
        });
    }
}