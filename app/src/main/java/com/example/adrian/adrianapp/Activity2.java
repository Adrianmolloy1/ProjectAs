package com.example.adrian.adrianapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    @SuppressLint("NewApi") @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

            Intent intent = getIntent();
            String msg = intent.getStringExtra(Activity1.MESSAGE);
            int Int1 = intent.getIntExtra("int_id_1",0);
            Bundle b = getIntent().getExtras();
            String str2 = b.getString("string2", "");
            int int2 = b.getInt("int_id_1");
            String toast = "Received Data : String - " + msg + "Integer - " + String.valueOf(Int1) + " \n " + "Received Data through Bundle : String - " + str2 + "Integer - " + String.valueOf(int2) ;
            Toast.makeText(this, toast  , Toast.LENGTH_LONG).show();
        }
    }

