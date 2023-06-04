package com.tkr.tkrtpushop.Admin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.tkr.tkrtpushop.R;

public class AdminAddNewProductActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_add_new_product);
        Toast.makeText(this, "Приветствую админа!", Toast.LENGTH_SHORT).show();
    }
}