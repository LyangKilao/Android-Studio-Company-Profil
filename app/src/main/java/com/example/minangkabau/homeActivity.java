package com.example.minangkabau;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import java.lang.reflect.Type;

public class homeActivity extends AppCompatActivity {

    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        t= (TextView) findViewById(R.id.judul);
        Typeface myCostumFont=Typeface.createFromAsset(getAssets(),"font/Losing Grip - TTF.ttf");
        t.setTypeface(myCostumFont);

        t= (TextView) findViewById(R.id.text);
        Typeface myCostumFont1=Typeface.createFromAsset(getAssets(),"font/Manuale-Regular.ttf");
        t.setTypeface(myCostumFont1);

        t= (TextView) findViewById(R.id.text2);
        Typeface myCostumFont2=Typeface.createFromAsset(getAssets(),"font/Manuale-Regular.ttf");
        t.setTypeface(myCostumFont2);

        t= (TextView) findViewById(R.id.text3);
        Typeface myCostumFont3=Typeface.createFromAsset(getAssets(),"font/Manuale-Regular.ttf");
        t.setTypeface(myCostumFont3);

        t= (TextView) findViewById(R.id.text4);
        Typeface myCostumFont4=Typeface.createFromAsset(getAssets(),"font/Manuale-Regular.ttf");
        t.setTypeface(myCostumFont4);

        t= (TextView) findViewById(R.id.app);
        Typeface myCostumFont5=Typeface.createFromAsset(getAssets(), "font/Bellaberry.otf");
        t.setTypeface(myCostumFont);



    }
}
