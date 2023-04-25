package com.example.sum_subtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText fristNum;
    EditText secNum;
    Button sumButton;
    Button subButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fristNum = findViewById(R.id.frist);
        secNum = findViewById(R.id.secound);
        sumButton = findViewById(R.id.sum);
        subButton = findViewById(R.id.sub);


        sumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(fristNum.getText().toString());
                double num2 = Double.parseDouble(secNum.getText().toString());
                double result = num1 + num2;
                Intent i = new Intent( MainActivity.this ,result.class);
                i.putExtra("result", result);
                startActivity(i);
            }
        });

        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(fristNum.getText().toString());
                double num2 = Double.parseDouble(secNum.getText().toString());
                double result = num1 - num2;
                Intent i = new Intent( MainActivity.this ,result.class);
                i.putExtra("result", result);
                startActivity(i);
            }
        });

    }
}