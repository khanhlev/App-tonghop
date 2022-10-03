package com.example.list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Profile extends AppCompatActivity {

    ImageView imgBack, imgLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        AnhXa();

    imgBack.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent back = new Intent(Profile.this, Home.class);
            startActivity(back);
        }
    });

    imgLogout.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent logout = new Intent( Profile.this, Login.class);
            startActivity(logout);
        }
    });

    }
    private void AnhXa(){
        imgBack = (ImageView) findViewById(R.id.imageviewBack);
        imgLogout = (ImageView) findViewById((R.id.imageviewLogout));
    }
}