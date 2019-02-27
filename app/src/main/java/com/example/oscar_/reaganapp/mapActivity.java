package com.example.oscar_.reaganapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mapActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);


        Button buttonBack = findViewById(R.id.btnBack);
        buttonBack.setOnClickListener(mapActivity.this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.btnBack:
                startActivity(new Intent(mapActivity.this, MainActivity.class));
                break;

        }
    }
}
