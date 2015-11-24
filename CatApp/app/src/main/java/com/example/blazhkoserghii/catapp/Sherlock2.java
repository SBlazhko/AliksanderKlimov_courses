package com.example.blazhkoserghii.catapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by BlazhkoS on 24.11.2015.
 */
public class Sherlock2 extends AppCompatActivity {

    public final static String THIEF = "com.example.blazhkoserghii.catapp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sherlock_2);
    }

    public void onRadioClick(View view) {
        Intent answerIntent = new Intent();

        switch (view.getId()){
            case R.id.radioCrow :
                answerIntent.putExtra(THIEF, "Кар, кар");
                break;
            case R.id.radioDog :
                answerIntent.putExtra(THIEF, "Сосіска, нє не чув !");
                break;
            case R.id.radioCat :
                answerIntent.putExtra(THIEF, "Це не Барсік, його підставили !!!");
                break;
            default: break;
        }

        setResult(RESULT_OK, answerIntent);
        finish();
    }
}
