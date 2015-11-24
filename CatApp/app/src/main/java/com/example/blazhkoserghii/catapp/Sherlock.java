package com.example.blazhkoserghii.catapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by BlazhkoS on 24.11.2015.
 */
public class Sherlock extends AppCompatActivity {

    static final private int CHOSE_THIEF = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sherlock_1);
    }

    public void onClick(View view) {
        Intent questionIntent = new Intent(this, Sherlock2.class);
        startActivityForResult(questionIntent, CHOSE_THIEF);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);

        TextView infoThief = (TextView) findViewById(R.id.textViewInfo);

        if(requestCode == CHOSE_THIEF){
            if(resultCode == RESULT_OK){
                String thiefName = data.getStringExtra(Sherlock2.THIEF);
                infoThief.setText(thiefName);
            }else {
                infoThief.setText("");
            }
        }
    }
}
