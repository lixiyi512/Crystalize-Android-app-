package com.example.ivy.crystalize;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/*
* author: Xiyi Li
* pitt id: xil129
*/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // go to first question page
    public void onMainPageClick(View view){
        Intent intent = new Intent(this,QuestionActivity.class);
        startActivity(intent);

    }
}
