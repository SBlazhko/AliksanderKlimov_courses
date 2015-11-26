package com.example.blazhkoserghii.catapp;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by BlazhkoS on 26.11.2015.
 */
public class Orientation extends AppCompatActivity {

    TextView t_orient;
    Boolean mState = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.orientation);

        t_orient = (TextView) findViewById(R.id.test_text);
    }


    public void onClick(View view) {
            t_orient.setText("Landscape");
    }
}
