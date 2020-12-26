package com.example.day3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle b=getIntent().getExtras();
        TextView na= findViewById(R.id.na2);
        TextView nu=findViewById(R.id.num2);
        TextView em=findViewById(R.id.em2);
        TextView lo=findViewById(R.id.lo2);

        //========================================

        na.setText(b.getString("info"));
        nu.setText(b.getString("phone"));
        em.setText(b.getString("email"));
        lo.setText(b.getString("location"));

        //==============
        nu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent= new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:"+97776050));
                startActivity(callIntent);
            } });

        em.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent email=new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL,b.getString("email"));
                email.putExtra(Intent.EXTRA_SUBJECT,"majooddark237514@gmail.com");
                email.putExtra(Intent.EXTRA_TEXT,"kuwait");
                email.setType("text/plain");
                startActivity(Intent.createChooser(email,"send email:"));


            }
        });

        lo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri=Uri.parse("https://goo.gl/maps/86vfimsgd6zhRf2x5");
                Intent mapIntent= new Intent(Intent.ACTION_VIEW,gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);

            }
        });

    }
}