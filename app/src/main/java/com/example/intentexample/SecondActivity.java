package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
TextView firstresult,lastresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
       firstresult=findViewById(R.id.firstnameresult);
        lastresult=findViewById(R.id.lastnameresult);
       Intent i2=getIntent();


      firstresult.setText(i2.getStringExtra("intentfirstname"));
       lastresult.setText(i2.getStringExtra("intentlastname"));


    }
}