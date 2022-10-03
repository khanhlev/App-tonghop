package com.example.list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SignUp extends AppCompatActivity {

    ImageView imgBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        AnhXa();

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(SignUp.this, Login.class);
                startActivity(back);
            }
        });
    }
    private void AnhXa(){

        imgBack = (ImageView) findViewById(R.id.imageviewBack_SU);
    }
}