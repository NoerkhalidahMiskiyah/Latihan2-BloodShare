package com.noerkhalidah.latihan2_bloodshare_10118077_noerkhalidahmiskiyah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class VerifyActivity extends AppCompatActivity {

    public void home(View view){
        Intent home = new Intent( VerifyActivity.this, UserHomeActivity.class);
        startActivity(home);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
    }
}