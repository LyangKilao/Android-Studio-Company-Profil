package com.example.minangkabau;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class kulinerActivity extends AppCompatActivity {

    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuliner);


        t= (TextView) findViewById(R.id.judul);
        Typeface myCostumFont=Typeface.createFromAsset(getAssets(),"font/Losing Grip - TTF.ttf");
        t.setTypeface(myCostumFont);

        t= (TextView) findViewById(R.id.rendang);
        Typeface myCostumFont1=Typeface.createFromAsset(getAssets(), "font/kiss.ttf");
        t.setTypeface(myCostumFont);

        t= (TextView) findViewById(R.id.sate);
        Typeface myCostumFont2=Typeface.createFromAsset(getAssets(), "font/kiss.ttf");
        t.setTypeface(myCostumFont);

        t= (TextView) findViewById(R.id.gule);
        Typeface myCostumFont3=Typeface.createFromAsset(getAssets(), "font/kiss.ttf");
        t.setTypeface(myCostumFont);

        t= (TextView) findViewById(R.id.jengkol);
        Typeface myCostumFont4=Typeface.createFromAsset(getAssets(), "font/kiss.ttf");
        t.setTypeface(myCostumFont);

        t= (TextView) findViewById(R.id.app);
        Typeface myCostumFont5=Typeface.createFromAsset(getAssets(), "font/Bellaberry.otf");
        t.setTypeface(myCostumFont);



    }
}
