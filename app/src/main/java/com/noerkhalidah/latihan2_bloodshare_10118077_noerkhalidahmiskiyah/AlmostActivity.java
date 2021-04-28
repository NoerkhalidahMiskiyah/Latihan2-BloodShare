package com.noerkhalidah.latihan2_bloodshare_10118077_noerkhalidahmiskiyah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AlmostActivity extends AppCompatActivity {

    public void verify(View view){
        Intent verify = new Intent( AlmostActivity.this, VerifyActivity.class);
        startActivity(verify);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost);
    }
}