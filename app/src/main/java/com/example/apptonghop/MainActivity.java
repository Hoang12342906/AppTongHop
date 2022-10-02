package com.example.apptonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        Button bt_chuyen_Signup = (Button) findViewById(R.id.bt_chuyensignup);
        Button btSignin = (Button) findViewById(R.id.buttonSignin);
        btSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doOpenHomeActivity();
            }
        });
        bt_chuyen_Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doOpenChuyensignupActivity();
            }
        });
    }

    public void doOpenHomeActivity()
    {
        Intent myIntent=new Intent(this, Home.class);
        startActivity(myIntent);
    }
    public void doOpenChuyensignupActivity()
    {
        Intent myIntent=new Intent(this, sign_up.class);
        startActivity(myIntent);
    }


}