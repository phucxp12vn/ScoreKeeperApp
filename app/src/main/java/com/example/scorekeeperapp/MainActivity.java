package com.example.scorekeeperapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scorePlayerA = 0;
    int scorePlayerB = 0;
    TextView scoreViewA= null;
    TextView scoreViewB = null;
    TextView resultView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreViewA= (TextView) findViewById(R.id.scorePlayerA);
        scoreViewB = (TextView) findViewById(R.id.scorePlayerB);
        resultView = (TextView) findViewById(R.id.resultOfMatch);
    }

    public void getTicketPlayerA(View view) {
        scorePlayerA++;
        if(scorePlayerA == 21) {
            displayResult("player A");
        } else {
            displayScore(scoreViewA, scorePlayerA);
        }
    }

    public void getTicketPlayerB(View view) {
        scorePlayerB++;
        if(scorePlayerB == 21) {
            displayResult("player B");
        } else {
            displayScore(scoreViewB, scorePlayerB);
        }
    }

    public void resetMatch(View view) {
        scorePlayerA = 0;
        scorePlayerB = 0;
        displayScore(scoreViewA, scorePlayerA);
        displayScore(scoreViewB, scorePlayerB);
    }

    public void displayScore(TextView viewScore, int value) {
        viewScore.setText(String.valueOf(value));
    }

    public void displayResult(String winner) {
        resultView.setText(winner);
    }
}
