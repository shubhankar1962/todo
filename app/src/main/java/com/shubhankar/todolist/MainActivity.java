package com.shubhankar.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
        Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signup=findViewById(R.id.signup);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,register_activity.class));
            }
        });

        //signup.setOnClickListener(v -> startActivity(new Intent(MainActivity.this,register_activity.class)));
    }

    public void Login(View view) {

         startActivity(new Intent(MainActivity.this,login_activity.class));
    }


}