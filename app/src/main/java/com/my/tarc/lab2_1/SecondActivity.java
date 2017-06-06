package com.my.tarc.lab2_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.jar.Attributes;

public class SecondActivity extends AppCompatActivity {
    private TextView textViewMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textViewMessage = (TextView)findViewById(R.id.textViewMessage);
        Bundle extras = getIntent().getExtras();

        if(! extras.isEmpty()){
            String message = (String)extras.getString(MainActivity.MSG_EXTRA);
            String name = (String)extras.getString(MainActivity.NAME_EXTRA);
            String age = (String)extras.getString(MainActivity.AGE_EXTRA);

            textViewMessage.setText("Hi, " + name + "\n" + "You are very " + message + "\n" +"and " + age + " years old.");

        }
    }
}
