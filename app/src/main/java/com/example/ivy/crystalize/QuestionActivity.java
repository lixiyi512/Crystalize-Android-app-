package com.example.ivy.crystalize;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.security.PublicKey;
/*
* author: Xiyi Li
* pitt id: xil129
*/
public class QuestionActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.ivy.crystalize.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
    }

    //Hint message will show up after "HINT" is clicked
    public void onHintClick(View view){
        Toast toast = Toast.makeText(getApplicationContext(),getString(R.string.H1), Toast.LENGTH_SHORT);
        toast.show();
    }

    //When clicking "NEXT", it will show score and corresponding message based on the answer putting on the "answer" textfield.
    public void onAnswerClick(View view){
        String answer = ((EditText) findViewById(R.id.answer)).getText().toString();
        answer = answer.toLowerCase();
        String correctAnswer = getString(R.string.A1);
        int sum;
        if(answer.equals(correctAnswer)){
            Intent intent= new Intent(this,Question2.class);
            sum = 1;
            String point = Integer.toString(sum);
            Toast toast = Toast.makeText(getApplicationContext(), "RIGHT! " + point + "/4", Toast.LENGTH_SHORT);
            toast.show();
            intent.putExtra(EXTRA_MESSAGE,point);
            startActivity(intent);
        }else{

            Intent intent= new Intent(this,Question2.class);
            sum = 0;
            String point = Integer.toString(sum);
            Toast toast = Toast.makeText(getApplicationContext(),"Wrong! Answer is 【"+getString(R.string.A1) +"】" + point +"/4", Toast.LENGTH_SHORT);
            toast.show();
            intent.putExtra(EXTRA_MESSAGE, point);
            startActivity(intent);
        }
    }

    // Click "back" button to go back to previous page.
    public void onBackClick(View view){
        Intent intent1 = new Intent(this,MainActivity.class);

        startActivity(intent1);
    }
}
