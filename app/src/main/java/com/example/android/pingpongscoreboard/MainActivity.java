package com.example.android.pingpongscoreboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int pointsA = 0;
    int pointsB = 0;
    int serva = 0;
    int serva2 = 0;

    public void PlusForA(View v) {

        /** set and display the serva counter */

        serva = serva + 1;

        if (serva2%2 == 1) {
            displayservaB(serva);
            displayservaA(0);
        } else {
            displayservaA(serva);
            displayservaB(0);}

        if (serva == 2 ){
            serva2 = serva2 + 1;
            serva = 0;
        }

        /** set and display the point counter */

        pointsA = pointsA + 1;
        displayForA(pointsA);

    }
    public void MinusForA(View v) {
        serva = serva + 1;

        if (serva2%2 == 1) {
            displayservaB(serva);
            displayservaA(0);
        } else {
            displayservaA(serva);
            displayservaB(0);}

        if (serva == 2 ){
            serva2 = serva2 + 1;
            serva = 0;
        }

        /** set and display the point counter */

            pointsA = pointsA - 1;
            displayForA(pointsA);

    }

    public void PlusForB(View v) {
        serva = serva + 1;
        if (serva2%2 == 1) {
            displayservaB(serva);
            displayservaA(0);
        } else {
            displayservaA(serva);
            displayservaB(0);}

        if (serva == 2 ){
            serva2 = serva2 + 1;
            serva = 0;
        }

        /** set and display the point counter */

            pointsB = pointsB + 1;
            displayForB(pointsB);

    }
    public void MinusForB(View v) {
        serva = serva + 1;
         if (serva2%2 == 1) {
            displayservaB(serva);
            displayservaA(0);
        } else {
            displayservaA(serva);
            displayservaB(0);}

        if (serva == 2 ){
            serva2 = serva2 + 1;
            serva = 0;
        }

        /** set and display the point counter */

            pointsB = pointsB - 1;
            displayForB(pointsB);

    }
    public void displayForA(int point) {
        TextView scoreView = (TextView) findViewById(R.id.pointA);
        scoreView.setText(String.valueOf(point));
    }
    public void displayForB(int point) {
        TextView scoreView = (TextView) findViewById(R.id.pointB);
        scoreView.setText(String.valueOf(point));
    }
    public void displayservaA(int serva) {
        TextView scoreView = (TextView) findViewById(R.id.settA);
        scoreView.setText(String.valueOf(serva));
    }
    public void displayservaB(int serva) {
        TextView scoreView = (TextView) findViewById(R.id.settB);
        scoreView.setText(String.valueOf(serva));
    }



    public void resetAB(View v) {
        pointsA = 0;
        pointsB = 0;
        serva = 0;
        serva2 = 0;
        displayservaA(serva);
        displayservaB(serva);
        displayForA(pointsA);
        displayForB(pointsB);
    }
}
