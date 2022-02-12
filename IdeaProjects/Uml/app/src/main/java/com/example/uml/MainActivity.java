package com.example.uml;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    EditText nameText;
    EditText ageText;
    CheckBox femaleCB;
    TextView messageText;

    StudentStats studentStats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameText = findViewById(R.id.nameText);
        ageText = findViewById(R.id.ageText);
        femaleCB = findViewById(R.id.femaleCB);
        messageText = findViewById(R.id.messageText);
    }

    public void CreateClick(View view){
        studentStats = new StudentStats();
        studentStats.name = nameText.getText().toString();
        studentStats.age = Integer.parseInt(ageText.getText().toString());
        studentStats.isFemale = femaleCB.isChecked();

        messageText.setText(studentStats.getInfo());
    }

    public void GoClick(View view){
        if (studentStats!=null) {
            messageText.setText(studentStats.Birthday());
        }
    }
}