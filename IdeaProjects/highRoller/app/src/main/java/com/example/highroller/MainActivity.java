package com.example.highroller;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Die die = new Die();

    EditText player1Name;
    EditText player2Name;
    EditText player3Name;
    EditText player1Score;
    EditText player2Score;
    EditText player3Score;
    EditText d1;
    EditText d2;
    EditText d3;
    EditText d4;
    TextView roundLabel;
    TextView textView;
    int activePlayer = 1;
    int roundNumber = 1;



    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        player1Name = findViewById(R.id.player1Name);
        player2Name = findViewById(R.id.player2Name);
        player3Name = findViewById(R.id.player3Name);
        player1Score = findViewById(R.id.player1Score);
        player2Score = findViewById(R.id.player2Score);
        player3Score = findViewById(R.id.player3Score);
        d1 = findViewById(R.id.d1);
        d2 = findViewById(R.id.d2);
        d3 = findViewById(R.id.d3);
        d4 = findViewById(R.id.d4);
        roundLabel = findViewById(R.id.roundLabel);
        textView = findViewById(R.id.textView);
    }

    public void RollClick(View view){
        Player player = new Player(player1Name.getText().toString(),
                player2Name.getText().toString(), player3Name.getText().toString(),
                player1Score.getText().toString(), player2Score.getText().toString(),
                player3Score.getText().toString());

        int d1Roll = Die.Roll();
        int d2Roll = Die.Roll();
        int d3Roll = Die.Roll();
        int d4Roll = Die.Roll();

        String score;
        String endString = "";

        int newSum = d1Roll + d2Roll + d3Roll + d4Roll;

        d1.setText(Integer.toString(d1Roll));
        d2.setText(Integer.toString(d2Roll));
        d3.setText(Integer.toString(d3Roll));
        d4.setText(Integer.toString(d4Roll));

        if (activePlayer==1){
            player.p1s += newSum;
            score = Integer.toString(newSum);
            player1Score.setText(Integer.toString(player.p1s));
            endString = player.p1n + " scored " + score + "! \n\n" + player.p2n + "'s turn.";
            activePlayer = 2;
        }
        else if (activePlayer==2){
            player.p2s += newSum;
            score = Integer.toString(newSum);
            player2Score.setText(Integer.toString(player.p2s));
            endString = player.p2n + " scored " + score + "! \n\n" + player.p3n + "'s turn.";
            activePlayer = 3;
        }
        else {
            player.p3s += newSum;
            score = Integer.toString(newSum);
            player3Score.setText(Integer.toString(player.p3s));

            activePlayer = 1;
            if (roundNumber ==3){
                String winner = player.findWinner(player.p1n, player.p1s,
                        player.p2n, player.p2s, player.p3n, player.p3s);


                endString = "GAME OVER\n\n" + winner + " is the winner!";

            }
            else{
                endString = player.p3n + " scored " + score + "! \n\n" + player.p1n + "'s turn.";
                roundNumber +=1;
                String roundString = Integer.toString(roundNumber);
                roundLabel.setText("Round: "+ roundString);
            }
        }

        textView.setText(endString);
    }
}