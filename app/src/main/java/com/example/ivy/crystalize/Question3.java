package com.example.ivy.crystalize;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/*
* author: Xiyi Li
* pitt id: xil129
*/
public class Question3 extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.ivy.crystalize.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
        /*Intent intent=getIntent();
        int point = Integer.parseInt(intent.getStringExtra(Question2.EXTRA_MESSAGE));
        TextView textView = (TextView) findViewById(R.id.showPoint);
        textView.setText("Point:" + point);*/
    }
    //Hint message will show up after "HINT" is clicked
    public void onHintClick(View view){
        Toast toast = Toast.makeText(getApplicationContext(),getString(R.string.H3), Toast.LENGTH_SHORT);
        toast.show();
    }

    //When clicking "NEXT", it will show score and corresponding message based on the answer putting on the "answer" textfield.
    public void onAnswerClick(View view){
        String answer = ((EditText) findViewById(R.id.answer)).getText().toString();
        answer = answer.toLowerCase();
        String correctAnswer = getString(R.string.A3);
        Intent intent=getIntent();
        String point = intent.getStringExtra(Question2.EXTRA_MESSAGE);

        if(answer.equals(correctAnswer)){
            int sum = Integer.parseInt(point) + 1;
            Intent intent1= new Intent(this,Question4.class);
            Toast toast = Toast.makeText(getApplicationContext(),"RIGHT!" + sum +"/4", Toast.LENGTH_LONG);
            toast.show();
            intent1.putExtra(EXTRA_MESSAGE, Integer.toString(sum));
            startActivity(intent1);


        }else{
            Intent intent1= new Intent(this,Question4.class);
            Toast toast = Toast.makeText(getApplicationContext(),"Wrong! Answer is 【"+getString(R.string.A3) +"】" +  point +"/4", Toast.LENGTH_SHORT);
            toast.show();
            intent1.putExtra(EXTRA_MESSAGE, point);
            startActivity(intent1);
        }
    }

    // Click "back" button to go back to previous page.
    public void onBackClick(View view){
        Intent intent1 = new Intent(this,Question2.class);

        startActivity(intent1);
    }
}
