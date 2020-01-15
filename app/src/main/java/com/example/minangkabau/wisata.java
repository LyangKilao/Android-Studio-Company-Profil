package com.example.minangkabau;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class wisata extends AppCompatActivity {

    LinearLayout jam ;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata);

        jam   = (LinearLayout) findViewById(R.id.jam);

        jam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jam = new Intent(wisata.this,DestinationActivity.class);
                startActivity(jam);
            }
        });

        t= (TextView) findViewById(R.id.judul);
        Typeface myCostumFont=Typeface.createFromAsset(getAssets(),"font/Losing Grip - TTF.ttf");
        t.setTypeface(myCostumFont);

        t= (TextView) findViewById(R.id.gadang);
        Typeface myCostumFont1=Typeface.createFromAsset(getAssets(), "font/kiss.ttf");
        t.setTypeface(myCostumFont);

        t= (TextView) findViewById(R.id.pantai);
        Typeface myCostumFont2=Typeface.createFromAsset(getAssets(), "font/kiss.ttf");
        t.setTypeface(myCostumFont);

        t= (TextView) findViewById(R.id.mande);
        Typeface myCostumFont3=Typeface.createFromAsset(getAssets(), "font/kiss.ttf");
        t.setTypeface(myCostumFont);

        t= (TextView) findViewById(R.id.pariaman);
        Typeface myCostumFont4=Typeface.createFromAsset(getAssets(), "font/kiss.ttf");
        t.setTypeface(myCostumFont);

        t= (TextView) findViewById(R.id.kelok);
        Typeface myCostumFont5=Typeface.createFromAsset(getAssets(), "font/kiss.ttf");
        t.setTypeface(myCostumFont);

        t= (TextView) findViewById(R.id.gadangket);
        Typeface myCostumFont6=Typeface.createFromAsset(getAssets(), "font/Forgiven Script - TTF.ttf");
        t.setTypeface(myCostumFont);

        t= (TextView) findViewById(R.id.pantaiket);
        Typeface myCostumFont7=Typeface.createFromAsset(getAssets(), "font/Forgiven Script - TTF.ttf");
        t.setTypeface(myCostumFont);

        t= (TextView) findViewById(R.id.mandeket);
        Typeface myCostumFont8=Typeface.createFromAsset(getAssets(), "font/Forgiven Script - TTF.ttf");
        t.setTypeface(myCostumFont);

        t= (TextView) findViewById(R.id.pariamanket);
        Typeface myCostumFont9=Typeface.createFromAsset(getAssets(), "font/Forgiven Script - TTF.ttf");
        t.setTypeface(myCostumFont);

        t= (TextView) findViewById(R.id.kelokket);
        Typeface myCostumFont10=Typeface.createFromAsset(getAssets(), "font/Forgiven Script - TTF.ttf");
        t.setTypeface(myCostumFont);

        t= (TextView) findViewById(R.id.view);
        Typeface myCostumFont11=Typeface.createFromAsset(getAssets(), "font/Courgette-Regular.ttf");
        t.setTypeface(myCostumFont);



    }
}
