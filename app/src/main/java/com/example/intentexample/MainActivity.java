package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText firstname,lastname;
Button clickme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstname=findViewById(R.id.FirstName);
        lastname=findViewById(R.id.LastName);
        clickme=findViewById(R.id.button);
        clickme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,SecondActivity.class);
                i.putExtra("intentfirstname",firstname.getText().toString());
                i.putExtra("intentlastname",lastname.getText().toString());
                startActivity(i);
            }
        });
    }
}