package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class History extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        text = findViewById(R.id.memory);
        ArrayList<String> mem = (ArrayList<String>) getIntent().getSerializableExtra("his");
        text.setText(String.valueOf(mem));
    }
}