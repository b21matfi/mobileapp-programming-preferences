package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    SharedPreferences sharedview;
    SharedPreferences.Editor edit;

    EditText usernames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        sharedview = getSharedPreferences("preferences", MODE_PRIVATE);
        edit = sharedview.edit();

        Button logout = findViewById(R.id.logout);
        usernames = findViewById(R.id.username);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
                edit.putString("username", usernames.getText().toString());
                edit.apply();
            }
        });


    }
}