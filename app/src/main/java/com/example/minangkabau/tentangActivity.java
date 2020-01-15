package com.example.minangkabau;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class tentangActivity extends AppCompatActivity {

    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);

        t= (TextView) findViewById(R.id.tentang);
        Typeface myCostumFont=Typeface.createFromAsset(getAssets(),"font/Forgiven Script - TTF.ttf");
        t.setTypeface(myCostumFont);
    }
}
