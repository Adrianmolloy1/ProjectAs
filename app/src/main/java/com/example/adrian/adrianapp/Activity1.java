package com.example.adrian.adrianapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Activity1 extends AppCompatActivity {

    EditText msg ;
    public static final String MESSAGE = "com.example.SIMPLE_MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        msg =(EditText) findViewById(R.id.msg);

    }
    public void startSecond(View v){
        String s = msg.getText().toString();

        Intent i = new Intent(this, Activity2.class);
        i.putExtra(MESSAGE, s);
        i.putExtra("int_id_1", 100);

        Bundle bundle = new Bundle();
        String str2 = "coming through bundle";
        bundle.putString("string2", str2);
        bundle.putInt("int_id_2", 200);
        i.putExtras(bundle);
        String toast = "Sending data : " + s + " and Integer 100 \n Sending through Bundle, String : "+ str2+" and Integer : 200";
        Toast.makeText(this,toast , Toast.LENGTH_SHORT).show();
        startActivity(i);
    }
}


