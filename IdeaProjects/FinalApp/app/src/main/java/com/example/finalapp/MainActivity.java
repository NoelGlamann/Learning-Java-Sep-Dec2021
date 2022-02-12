package com.example.finalapp;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    EditText goalEntry;
    EditText goalToUpdate;
    EditText newStatusUpdate;
    TextView responseText;

    ArrayList<String[]> goals = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goalEntry = findViewById(R.id.goalEntry);
        goalToUpdate = findViewById(R.id.editGoalName);
        newStatusUpdate = findViewById(R.id.newStatusUpdate);
        responseText = findViewById(R.id.responseText);
    }

    public void addGoal(View view){
        String goalName = goalEntry.getText().toString();
        String[] newGoal = {goalName, "Added New"};
        goals.add(newGoal);
        responseText.setText("''"+goalName+"''" + " added to list.");
        goalEntry.getText().clear();
    }

    public void findGoal(View view){
        String goalToSearch = goalEntry.getText().toString();
        boolean found = false;
        String goalTitle = "";
        String goalStatus = "";
        for (int i = 0; i<goals.size(); i++){
            String[] goalInfo = goals.get(i);
            String goalName = goalInfo[0];
            if (goalName.toLowerCase(Locale.ROOT).contains(goalToSearch) || goalName == goalToSearch){
                found = true;
                goalTitle = goalName;
                goalStatus = goalInfo[1];
                break;
            }
        }
        if (found){
            responseText.setText("Goal Found!\nGiven Title: "+ goalTitle + "\nStatus: "+ goalStatus);
        } else{
            responseText.setText("Not Found.");
        }
        goalEntry.getText().clear();
    }

    public void displayAll(View view){
        String currentGoal = "";
        String currentStatus = "";
        String finalList = "Goals in your list: \n\n";
        for (int i = 0; i<goals.size(); i++) {
            String[] goalInfo = goals.get(i);
            currentGoal = goalInfo[0];
            currentStatus = goalInfo[1];
            finalList += currentGoal + " (" + currentStatus + ")\n";
        }
        responseText.setText(finalList);
    }

    public void editProgress(View view){
        String goalToSearch = goalToUpdate.getText().toString();
        String newStatus = newStatusUpdate.getText().toString();
        boolean found = false;
        String goalTitle = "";
        String goalStatus = "";
        for (int i = 0; i<goals.size(); i++){
            String[] goalInfo = goals.get(i);
            String goalName = goalInfo[0];
            if (goalName.toLowerCase(Locale.ROOT).contains(goalToSearch) || goalName == goalToSearch){
                found = true;
                goalInfo[1] = newStatus;
                goalTitle = goalName;
                goalStatus = goalInfo[1];
                break;
            }
        }
        if (found){
            responseText.setText("Goal Updated: \n\n''"+goalTitle+"'' new status - " + goalStatus);
        } else{
            responseText.setText("There's been an error.\nIt seems "+goalToSearch+" was not found in your list.");
        }
        goalToUpdate.getText().clear();
        newStatusUpdate.getText().clear();
    }
}