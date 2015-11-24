package com.example.blazhkoserghii.catapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by BlazhkoS on 24.11.2015.
 */
public class IntentWork2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intent_work2);

        String whom = getIntent().getExtras().getString("whom");
        String fWhom = getIntent().getExtras().getString("where");
        String sms = getIntent().getExtras().getString("what");

        TextView info = (TextView)findViewById(R.id.txt_intent2);
        info.setText(whom + " тобі передали смс  \n\n " +
        "з текстом :\n" + sms + "\n\n" + "від " + fWhom);
    }
}
