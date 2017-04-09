package com.slayer.cxj.demoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        findViewById(R.id.button_signup).setOnClickListener(this);
        findViewById(R.id.link_login).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_signup: {
                break;
            }
            case R.id.link_login: {
                finish();
                break;
            }
        }

    }
}
