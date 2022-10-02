package com.example.apptonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button btlist = (Button) findViewById(R.id.Bt_ActivityList);
        Button btprofile = (Button) findViewById(R.id.Bt_ActivityProfile);

        btlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doOpenListActivity();
            }
        });

        btprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doOpenProfileActivity();
            }
        });
    }
    private  void doOpenListActivity(){
        Intent intent = new Intent(this, MainFood.class);
        startActivity(intent);
    }
    private void doOpenProfileActivity(){
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }
}