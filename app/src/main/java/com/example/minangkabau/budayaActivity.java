package com.example.minangkabau;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class budayaActivity extends AppCompatActivity {

    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budaya);

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

        t= (TextView) findViewById(R.id.judul2);
        Typeface myCostumFont0=Typeface.createFromAsset(getAssets(),"font/Losing Grip - TTF.ttf");
        t.setTypeface(myCostumFont0);

        t= (TextView) findViewById(R.id.text5);
        Typeface myCostumFont5=Typeface.createFromAsset(getAssets(),"font/Manuale-Regular.ttf");
        t.setTypeface(myCostumFont5);

        t= (TextView) findViewById(R.id.text6);
        Typeface myCostumFont6=Typeface.createFromAsset(getAssets(),"font/Manuale-Regular.ttf");
        t.setTypeface(myCostumFont6);

        t= (TextView) findViewById(R.id.text7);
        Typeface myCostumFont7=Typeface.createFromAsset(getAssets(),"font/Manuale-Regular.ttf");
        t.setTypeface(myCostumFont7);

        t= (TextView) findViewById(R.id.text8);
        Typeface myCostumFont8=Typeface.createFromAsset(getAssets(),"font/Manuale-Regular.ttf");
        t.setTypeface(myCostumFont8);

        t= (TextView) findViewById(R.id.text9);
        Typeface myCostumFont9=Typeface.createFromAsset(getAssets(),"font/Manuale-Regular.ttf");
        t.setTypeface(myCostumFont9);

        t= (TextView) findViewById(R.id.text10);
        Typeface myCostumFont10=Typeface.createFromAsset(getAssets(),"font/Manuale-Regular.ttf");
        t.setTypeface(myCostumFont10);

        t= (TextView) findViewById(R.id.app);
        Typeface myCostumFont11=Typeface.createFromAsset(getAssets(), "font/Bellaberry.otf");
        t.setTypeface(myCostumFont);

    }
}
