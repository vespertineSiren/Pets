package com.example.patrickjmartin.pets;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Context context;
    LinearLayout listLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        listLayout = findViewById(R.id.linear_layout);

        TextView animalsTextView = new TextView(context);
        animalsTextView.setText("Current pets: \nAmmo - Cat \nBuddha - Cat\nLucky - Cat" +
                "\n\nPast Pet: \nPeaches - Cat");
        animalsTextView.setTextSize(24);
        listLayout.addView(animalsTextView);

    }
}