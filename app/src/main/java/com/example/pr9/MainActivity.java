package com.example.pr9;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView dalshie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dalshie = findViewById(R.id.imageView28);
        dalshie.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        startActivity(new Intent(this, steps.class));
    }
}