package com.uollas.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class AreaScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_screen);

        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etAge = (EditText) findViewById(R.id.etAge);
        final TextView tvWelcome = (TextView) findViewById(R.id.tvWelcome);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String username = intent.getStringExtra("username");
        int age = intent.getIntExtra("age", -1);

        String messagge = name + " benvenuto nell'area clienti!";
        tvWelcome.setText(messagge);
        etUsername.setText(username);
        etAge.setText(age + "");


    }
}
