package com.noerkhalidah.latihan2_bloodshare_10118077_noerkhalidahmiskiyah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void register(View view){
        Intent register = new Intent( LoginActivity.this, RegisterActivity.class);
        startActivity(register);
    }
}