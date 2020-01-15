package com.example.minangkabau;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class pakaianActivity extends AppCompatActivity {

    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pakaian);

        t= (TextView) findViewById(R.id.judul);
        Typeface myCostumFont=Typeface.createFromAsset(getAssets(),"font/Losing Grip - TTF.ttf");
        t.setTypeface(myCostumFont);

        t= (TextView) findViewById(R.id.wanita);
        Typeface myCostumFont1=Typeface.createFromAsset(getAssets(), "font/kiss.ttf");
        t.setTypeface(myCostumFont);

        t= (TextView) findViewById(R.id.laki);
        Typeface myCostumFont2=Typeface.createFromAsset(getAssets(), "font/kiss.ttf");
        t.setTypeface(myCostumFont);

        t= (TextView) findViewById(R.id.pengantin);
        Typeface myCostumFont3=Typeface.createFromAsset(getAssets(), "font/kiss.ttf");
        t.setTypeface(myCostumFont);

        t= (TextView) findViewById(R.id.waket);
        Typeface myCostumFont4=Typeface.createFromAsset(getAssets(), "font/Manuale-Regular.ttf");
        t.setTypeface(myCostumFont);

        t= (TextView) findViewById(R.id.laket);
        Typeface myCostumFont5=Typeface.createFromAsset(getAssets(), "font/Manuale-Regular.ttf");
        t.setTypeface(myCostumFont);

        t= (TextView) findViewById(R.id.tinket);
        Typeface myCostumFont6=Typeface.createFromAsset(getAssets(), "font/Manuale-Regular.ttf");
        t.setTypeface(myCostumFont);

        t= (TextView) findViewById(R.id.app);
        Typeface myCostumFont7=Typeface.createFromAsset(getAssets(), "font/Bellaberry.otf");
        t.setTypeface(myCostumFont);

    }
}
