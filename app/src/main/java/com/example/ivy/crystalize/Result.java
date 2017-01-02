package com.example.ivy.crystalize;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
/*
* author: Xiyi Li
* pitt id: xil129
*/
public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView result = (TextView) findViewById(R.id.showPoint);
        TextView status = (TextView) findViewById(R.id.status);
        ImageView img = (ImageView) findViewById(R.id.statusImg);

        Intent intent = getIntent();
        String point = intent.getStringExtra(Question4.EXTRA_MESSAGE);
        int sum = Integer.parseInt(point);

        //show different test result based on score.
        if(sum >=3){
            String message = "You have answered " + point + " questions correct! You are really a NERD :]";
            result.setText(message);
            status.setText("Congratulations!!!");
            img.setImageResource(R.drawable.nerdy2);}
        else if(sum>=1 && sum<3){
            String message = "You have answered " + point + " questions correct! You are kinda nerdy :]";
            result.setText(message);
            status.setText("HEY MAN,");
            img.setImageResource(R.drawable.nerdy);}
        else if(sum == 0 ){
            String message = "You don't know any of the questions? You are not nerdy at all :]";
            result.setText(message);
            status.setText("OH NO,");
            img.setImageResource(R.drawable.nerdy3);}
        }
    }
