package com.example.rahabi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nextPage(View view) {

        TextView textView = findViewById(R.id.sign_in);
        Intent intent = new Intent(this, ActivityWelcome.class);
        startActivity(intent);
    }
}
