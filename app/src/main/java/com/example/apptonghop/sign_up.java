package com.example.apptonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sign_up extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Button btsignup = (Button) findViewById(R.id.buttonSignup);
        Button bt_chuyen_signin =(Button) findViewById(R.id.bt_chuyensignin);

        btsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doOpenSignActivity();
            }
        });

        bt_chuyen_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doOpenSignActivity();
            }
        });
    }
    private void doOpenSignActivity(){
        Intent myIntent = new Intent(this, MainActivity.class);
        startActivity(myIntent);
    }

}