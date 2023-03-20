package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Count_Cals extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.numsofcal);
        Intent intent = getIntent();
        String historyCount = intent.getStringExtra("HistoryCount");

        TextView history = (TextView) findViewById(R.id.numberofcals);
        history.setText("You've clicked '=' " + historyCount + " times");

    }
}
