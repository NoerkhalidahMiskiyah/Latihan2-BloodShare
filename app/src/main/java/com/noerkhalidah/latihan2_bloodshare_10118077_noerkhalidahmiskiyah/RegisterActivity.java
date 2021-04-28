package com.noerkhalidah.latihan2_bloodshare_10118077_noerkhalidahmiskiyah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class RegisterActivity extends AppCompatActivity {

    public void back(View view){
        Intent back = new Intent( RegisterActivity.this, LoginActivity.class);
        startActivity(back);
    }

    public void almost(View view){
        Intent almost = new Intent( RegisterActivity.this, AlmostActivity.class);
        startActivity(almost);
    }

    public void RadioButtonClicked1(View view){
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.male:
                if (checked)
                    break;
            case R.id.female:
                if (checked)
                    break;
        }
    }

    public void RadioButtonClicked2(View view){
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()){
            case R.id.personal:
                if (checked)
                    break;
            case R.id.organization:
                if (checked)
                    break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
}