package com.example.guilherme.ofertapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.text_view);
        String text = "bold";
                SpannableString ss = new SpannableString(text);
                        StyleSpan boldspan = new StyleSpan(typeface.bold);
    }
}
