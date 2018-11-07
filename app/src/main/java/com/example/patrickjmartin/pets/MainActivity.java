package com.example.patrickjmartin.pets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Context context;
    LinearLayout listLayout;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        listLayout = findViewById(R.id.linear_layout);

        TextView animalsTextView = new TextView(context);
        animalsTextView.setText("Current pets: \nAmmo - Cat \nBuddha - Cat\nLucky - Cat" +
                "\n\nPast Pet: \nPeaches - Cat" +
                "\n\nAnimals Wanted: \nDjinn \nManticore");
        animalsTextView.setTextSize(24);
        listLayout.addView(animalsTextView);

    }
}
