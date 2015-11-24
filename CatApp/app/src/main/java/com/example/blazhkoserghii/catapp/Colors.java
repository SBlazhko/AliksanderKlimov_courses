package com.example.blazhkoserghii.catapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by Blazhko Serghii on 16.11.2015.
 */
public class Colors extends AppCompatActivity {
    private int count = 0;
    private LinearLayout mLayoutColors;
    private int[] colorMass = {R.color.red,R.color.orange,R.color.yellow,R.color.green,
            R.color.blue,R.color.indigo,R.color.violet};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.colors);
        mLayoutColors = (LinearLayout)findViewById(R.id.layoutColors);
    }

    public void onClick(View view) {
        int color = colorMass[count];
        mLayoutColors.setBackgroundColor(getResources().getColor(color));
        count++;
        if(count == 7 )count = 0;
    }
}
