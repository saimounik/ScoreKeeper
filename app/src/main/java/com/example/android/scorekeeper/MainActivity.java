package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;
import java.text.DateFormatSymbols;

public class MainActivity extends AppCompatActivity {

    int ScoreTeamA = 0;
    int ScoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main) ;
        displayForTeamA(0);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * This method is called when +3 points button is pressed
     *
     */
    public void addThreePointsForTeamA (View v) {
        ScoreTeamA = ScoreTeamA + 3;
        displayForTeamA(ScoreTeamA);

    }

    /**
     * This method is called when +2 points button is pressed
     */
    public void addTwoPointsForTeamA (View V) {
        ScoreTeamA = ScoreTeamA + 2;
        displayForTeamA(ScoreTeamA);

    }


    /**
     * This method is called when Free throw button is pressed
     */
    public void addOnePointForTeamA (View v) {
        ScoreTeamA = ScoreTeamA + 1 ;
        displayForTeamA(ScoreTeamA);

    }


    /**
     *  This Method is called when +3 button is pressed in Team B
     */
    public void addThreePointForTeamB (View v) {
        ScoreTeamB = ScoreTeamB + 3;
        displayForTeamB(ScoreTeamB);
    }


    /**
     *  This Method is called when +2 button is pressed in Team B
     */
    public void addTwoPointForTeamB (View v) {
        ScoreTeamB = ScoreTeamB + 2;
        displayForTeamB(ScoreTeamB);
    }


    /**
     *  This Method is called when Free throw is pressed in Team B
     */
    public void addOnePointForTeamB (View v) {
        ScoreTeamB = ScoreTeamB + 1;
        displayForTeamB(ScoreTeamB);
    }


    /**
     * This method is called when Reeset Button is pressed
     */
    public void resetScore (View v) {
        ScoreTeamA = 0;
        displayForTeamA(ScoreTeamA);
        ScoreTeamB = 0;
        displayForTeamB(ScoreTeamB);

    }



}

