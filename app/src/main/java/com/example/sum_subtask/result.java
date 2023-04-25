package com.example.sum_subtask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class result extends AppCompatActivity {
    TextView resultNum ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        resultNum = findViewById(R.id.txt);
        double result = getIntent().getDoubleExtra("result", 0.0);
        resultNum.setText("The result is: " + result);
    }
}