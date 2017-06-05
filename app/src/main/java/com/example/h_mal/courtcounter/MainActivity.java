package com.example.h_mal.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * code for team A side
     */
    int goalsTeamA = 0;

    /**
     * Displays the given goals for Team A.
     */
    public void goalsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_goals);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Add goals for team A.
     */
    public void addGoalA(View v) {
        goalsTeamA = goalsTeamA + 1;
        goalsForTeamA(goalsTeamA);
    }

    int redTeamA = 0;

    /**
     * Displays the given red cards for Team A.
     */
    public void redForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_red);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Add red card for team A.
     */
    public void redCardA(View v) {
        redTeamA = redTeamA + 1;
        redForTeamA(redTeamA);
    }

    int yellowTeamA = 0;

    /**
     * Displays the given yellow cards for Team A.
     */
    public void yellowForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellow);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Add yellow card for team A.
     */
    public void yellowCardA(View v) {
        yellowTeamA = yellowTeamA + 1;
        yellowForTeamA(yellowTeamA);
    }

    /**
     * code for team B side
     */
    int goalsTeamB = 0;

    /**
     * Displays the given goals for Team B.
     */
    public void goalsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_goals);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Add goals for team B.
     */
    public void addGoalB(View v) {
        goalsTeamB = goalsTeamB + 1;
        goalsForTeamB(goalsTeamB);
    }

    int redTeamB = 0;

    /**
     * Displays the given red cards for Team B.
     */
    public void redForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_red);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Add red card for team B.
     */
    public void redCardB(View v) {
        redTeamB = redTeamB + 1;
        redForTeamB(redTeamB);
    }

    int yellowTeamB = 0;

    /**
     * Displays the given yellow cards for Team A.
     */
    public void yellowForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellow);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Add yellow card for team B.
     */
    public void yellowCardB(View v) {
        yellowTeamB = yellowTeamB + 1;
        yellowForTeamB(yellowTeamB);
    }

    public void reset(View v) {
        goalsTeamA = 0;
        goalsForTeamA(goalsTeamA);
        redTeamA = 0;
        redForTeamA(redTeamA);
        yellowTeamA = 0;
        yellowForTeamA(yellowTeamA);
        goalsTeamB = 0;
        goalsForTeamB(goalsTeamB);
        redTeamB = 0;
        redForTeamB(redTeamB);
        yellowTeamB = 0;
        yellowForTeamB(yellowTeamB);
    }

}
