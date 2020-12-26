package com.example.day3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.concurrent.RunnableFuture;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText n= findViewById(R.id.name);
        EditText p= findViewById(R.id.phone);
        EditText e= findViewById(R.id.Email);
        EditText L=findViewById(R.id.Location);
        Button b=findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,MainActivity2.class);
                String na=n.getText().toString();
                String PH=p.getText().toString();
                String EM=e.getText().toString();
                String LO=L.getText().toString();

                i.putExtra("info",na);
                i.putExtra("phone",PH);
                i.putExtra("email",EM);
                i.putExtra("location",LO);

                startActivity(i);
            }
        });


    }
}
