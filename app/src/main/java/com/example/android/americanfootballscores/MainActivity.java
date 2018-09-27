package com.example.android.americanfootballscores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Global Variable  for Home & Visitor
    int scoreHome  = 0;
    int scoreVisitor = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //reset score for Home & Visitor
    public void resetScore(View v){
        scoreHome = 0;
        scoreVisitor = 0;
        displayForHome(scoreHome);
        displayForVisitor(scoreVisitor);

    }


    /**
     * Displays the given score for Home
     */
    public void displayForHome(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home);
        scoreView.setText(String.valueOf(score));
    }

    public  void  addSixHome(View v)
    {
        scoreHome = scoreHome + 6 ;
        displayForHome(scoreHome);
    }


    public  void  addThreeHome(View v)
    {
        scoreHome = scoreHome + 3 ;
        displayForHome(scoreHome);
    }

    public void addTwoHome(View v)
    {
        scoreHome = scoreHome + 2 ;
        displayForHome(scoreHome);
    }

    public void addOneHome(View v)
    {
        scoreHome = scoreHome + 1 ;
        displayForHome(scoreHome);
    }



    /**
     * Displays the given score for Visitor.
     */
    public void displayForVisitor(int score) {
        TextView scoreView = (TextView) findViewById(R.id.visitor);
        scoreView.setText(String.valueOf(score));
    }

    public  void  addSixVisitor(View v)
    {
        scoreVisitor = scoreVisitor + 6 ;
        displayForVisitor(scoreVisitor);
    }

    public  void  addThreeVisitor(View v)
    {
        scoreVisitor = scoreVisitor + 3 ;
        displayForVisitor(scoreVisitor);
    }

    public void addTwoVisitor(View v)
    {
        scoreVisitor = scoreVisitor + 2 ;
        displayForVisitor(scoreVisitor);
    }

    public void addOneVisitor(View v)
    {
        scoreVisitor = scoreVisitor + 1 ;
        displayForVisitor(scoreVisitor);
    }

}
