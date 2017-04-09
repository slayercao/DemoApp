package com.slayer.cxj.demoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.link_signup).setOnClickListener(this);
        findViewById(R.id.button_login).setOnClickListener(this);

    }


    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.link_signup: {
                Intent signUpIntent = new Intent(this, SignUpActivity.class);
                startActivity(signUpIntent);
                break;
            }
            case R.id.button_login: {
                break;
            }
        }
    }
}
