package com.shubhankar.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;

public class register_activity extends AppCompatActivity {
    //Button register=findViewById(R.id.register);
    Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        register=findViewById(R.id.register);

        register.setOnClickListener(view -> startActivity(new Intent(register_activity.this,HomePage_activity.class)));
    }
}