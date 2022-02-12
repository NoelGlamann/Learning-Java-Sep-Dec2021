package com.example.iterationexercise;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Numbers numbers = new Numbers();

    EditText editTextNumber;
    TextView finalNumbers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber = findViewById(R.id.editTextNumber);
        finalNumbers = findViewById(R.id.finalNumbers);
    }

    public void GoClick(View view) {
        int count = Integer.parseInt(editTextNumber.getText().toString());
        String finalNumberList = "";

        for (int i = 0; i < count; i++) {
            String newString = Integer.toString(numbers.getRandInt());
            finalNumberList += newString + ' ';
        }

        finalNumbers.setText(finalNumberList);


    }

}