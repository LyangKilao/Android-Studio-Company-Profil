package com.example.minangkabau;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    LinearLayout home, budaya , desti , kuliner , shirt , about ;

    ViewFlipper viewFlipper;
    Animation fadein, fadout ;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper);

        home    = (LinearLayout) findViewById(R.id.home);
        budaya  = (LinearLayout) findViewById(R.id.budaya);
        desti   = (LinearLayout) findViewById(R.id.desti);
        kuliner = (LinearLayout) findViewById(R.id.kuliner);
        shirt   = (LinearLayout) findViewById(R.id.shirt);
        about   = (LinearLayout) findViewById(R.id.about);


        fadein = AnimationUtils.loadAnimation(this,R.anim.fade_in);
        fadout = AnimationUtils.loadAnimation(this,R.anim.fade_out);
        viewFlipper.setInAnimation(fadein);
        viewFlipper.setOutAnimation(fadout);
        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(3000);
        viewFlipper.startFlipping();


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(MainActivity.this,homeActivity.class);
                startActivity(home);
            }
        });

        budaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent budaya = new Intent(MainActivity.this,budayaActivity.class);
                startActivity(budaya);
            }
        });

        desti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent desti = new Intent(MainActivity.this,wisata.class);
                startActivity(desti);
            }
        });

        kuliner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kuliner = new Intent(MainActivity.this,kulinerActivity.class);
                startActivity(kuliner);
            }
        });

        shirt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shirt = new Intent(MainActivity.this,pakaianActivity.class);
                startActivity(shirt);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent about = new Intent(MainActivity.this,tentangActivity.class);
                startActivity(about);
            }
        });
    }
}
