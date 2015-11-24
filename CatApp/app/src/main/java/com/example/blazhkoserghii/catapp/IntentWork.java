package com.example.blazhkoserghii.catapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Blazhko Serghii on 17.11.2015.
 */
public class IntentWork extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intent_work);
    }


    public void onClick(View view) {
        EditText e_whom = (EditText)findViewById(R.id.whom);
        EditText e_fWhom = (EditText)findViewById(R.id.fWhom);
        EditText e_sms = (EditText)findViewById(R.id.sms);
        Intent intent = new Intent(this,IntentWork2.class);
        intent.putExtra("whom", e_whom.getText().toString());
        intent.putExtra("where", e_fWhom.getText().toString());
        intent.putExtra("what", e_sms.getText().toString());
        startActivity(intent);
    }
}
