package com.example.android.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamAGoals = 0;
    int teamAFouls = 0;
    int teamBGoals = 0;
    int teamBFouls = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team A by 1 goal.
     */
    public void addGoalForTeamA(View v) {
        teamAGoals += 1;
        ((TextView) findViewById(R.id.team_a_goals)).setText(String.valueOf(teamAGoals));
    }

    /**
     * Increase the fouls for Team A by 1.
     */
    public void addFoulForTeamA(View v) {
        teamAFouls += 1;
        ((TextView) findViewById(R.id.team_a_fouls)).setText(String.valueOf(teamAFouls));
    }

    /**
     * Increase the score for Team B by 1 goal.
     */
    public void addGoalForTeamB(View v) {
        teamBGoals += 1;
        ((TextView) findViewById(R.id.team_b_goals)).setText(String.valueOf(teamBGoals));
    }

    /**
     * Increase the fouls for Team B by 1.
     */
    public void addFoulForTeamB(View v) {
        teamBFouls += 1;
        ((TextView) findViewById(R.id.team_b_fouls)).setText(String.valueOf(teamBFouls));
    }

    /**
     * Resets the score and fouls for both teams back to 0.
     */
    public void resetScore(View v) {
        teamAGoals = 0;
        teamAFouls = 0;
        teamBGoals = 0;
        teamBFouls = 0;
        ((TextView) findViewById(R.id.team_a_goals)).setText(String.valueOf(teamAGoals));
        ((TextView) findViewById(R.id.team_a_fouls)).setText(String.valueOf(teamAFouls));
        ((TextView) findViewById(R.id.team_b_goals)).setText(String.valueOf(teamBGoals));
        ((TextView) findViewById(R.id.team_b_fouls)).setText(String.valueOf(teamBFouls));
    }
}