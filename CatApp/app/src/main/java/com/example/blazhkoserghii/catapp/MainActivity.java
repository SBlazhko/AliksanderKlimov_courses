package com.example.blazhkoserghii.catapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

    }


    public void onClick(View view) {
        switch (view.getId()){
            case R.id.Hm1 :
                startActivity(new Intent(this,Colors.class));
                break;
            case R.id.Hm2 :
                startActivity(new Intent(this,IntentWork.class));
                break;
            case R.id.Hm3 :
                startActivity(new Intent(this,Sherlock.class));
                break;
        }
    }
}
