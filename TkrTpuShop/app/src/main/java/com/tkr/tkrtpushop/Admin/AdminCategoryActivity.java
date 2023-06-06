package com.tkr.tkrtpushop.Admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.tkr.tkrtpushop.R;

public class AdminCategoryActivity extends AppCompatActivity {
    private Button ColTomPol , MissionEng , THC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        init();

        ColTomPol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "ColTomPol");
            }
        });
        MissionEng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intentAddNew = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intentAddNew.putExtra("category", "MissionEng");
                startActivity(intentAddNew);
            }
        });
        THC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "THC");
            }
        });
    }

    private void init()
    {
        ColTomPol = findViewById(R.id.first_collection);
        MissionEng = findViewById(R.id.second_collection);
        THC = findViewById(R.id.third_collection);
    }
}