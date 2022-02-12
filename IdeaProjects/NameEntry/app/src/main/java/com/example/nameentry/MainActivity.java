package com.example.nameentry;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText nameEntry;
    TextView textView;

    ArrayList<String> names = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEntry = findViewById(R.id.nameEntry);
        textView = findViewById(R.id.textView);

    }

    public void AddClick(View view) {
        String name = String.valueOf(nameEntry.getText());
        if (!name.isEmpty()) {
            names.add(name);
            textView.setText(name + " added to list.");
        }
        else{
            textView.setText("Enter a valid name.");
        }
    }


    public void SearchClick(View view) {
        String name = String.valueOf(nameEntry.getText());
        boolean found = false;
        for (String n: names){
            if (n.equalsIgnoreCase(name)){
                found = true;
                break;
            }
        }
        if (found){
            textView.setText(name + " was found!");
        }
        else{
            textView.setText(name + " was not found!");
        }
    }

    public void DisplayClick(View view) {
        String nameList = "";
        for(int i = 0; i < names.size(); i++){
            if (i == 0){
                nameList += names.get(i);
            }
            else if (i == (names.size())){
                nameList += names.get(i);
            }
            else{
                nameList += ", " + names.get(i);
            }
        }
        textView.setText(nameList);
    }


}