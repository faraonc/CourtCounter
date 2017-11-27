package com.example.faraonc.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private int scoreA = 0;
    private int scoreB = 0;
    private final static int THREE = 3;
    private final static int TWO = 2;
    private final static int ONE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    void addThreeForTeamA(View view) {
        if ((this.scoreA + THREE) < Integer.MAX_VALUE) {
            displayForTeamA(this.scoreA = this.scoreA + THREE);
        }
    }

    void addTwoForTeamA(View view) {
        if ((this.scoreA + TWO) < Integer.MAX_VALUE) {
            displayForTeamA(this.scoreA = this.scoreA + TWO);
        }
    }

    void addOneForTeamA(View view) {
        if ((this.scoreA + ONE) < Integer.MAX_VALUE) {
            displayForTeamA(this.scoreA = this.scoreA + ONE);
        }
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    void addThreeForTeamB(View view) {
        if ((this.scoreB + THREE) < Integer.MAX_VALUE) {
            displayForTeamB(this.scoreB = this.scoreB + THREE);
        }
    }

    void addTwoForTeamB(View view) {
        if ((this.scoreB + TWO) < Integer.MAX_VALUE) {
            displayForTeamB(this.scoreB = this.scoreB + TWO);
        }
    }

    void addOneForTeamB(View view) {
        if ((this.scoreB + ONE) < Integer.MAX_VALUE) {
            displayForTeamB(this.scoreB = this.scoreB + ONE);
        }
    }

    void reset(View view)
    {
        this.scoreA = this.scoreB = 0;
        displayForTeamA(this.scoreA);
        displayForTeamB(this.scoreB);
    }
}
