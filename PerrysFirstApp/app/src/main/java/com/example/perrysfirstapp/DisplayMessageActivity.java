package com.example.perrysfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.BreakIterator;

import static com.example.perrysfirstapp.R.id.text;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

//        // Get the Intent that started this activity and extract the string
//        Intent intent = getIntent();
//        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
//
//        // Capture the layout's TextView and set the string as its text
//        TextView textView = findViewById(text);
//        textView.setText(message);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.textView);

//        String data = getIntent().getExtras().getString("AnyKeyName");
//        BreakIterator textview;
//        textview.setText(data);
//
//        // Capture the layout's TextView and set the string as its text
//        TextView textView = findViewById(text);
//        textView.setText(message);

    }
}