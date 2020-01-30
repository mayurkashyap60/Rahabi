package com.example.rahabi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityWelcome extends AppCompatActivity {

    private CardView one, two, three;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        one = (CardView) findViewById(R.id.layout_one);
        two = (CardView) findViewById(R.id.layout_two);
        three = (CardView) findViewById(R.id.layout_three);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityWelcome.this, Screen.class));

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityWelcome.this, Screen.class));
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityWelcome.this, Screen.class));
            }
        });
    }
}
