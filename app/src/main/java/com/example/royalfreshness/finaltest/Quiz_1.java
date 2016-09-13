package com.example.royalfreshness.finaltest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Quiz_1 extends AppCompatActivity {

    String[] quizQuestions, quizAnswers;
    Button yes;
    TextView qBox, oneButton, twoButton;
    int start = 0;
    int ans1 = 0;
    int ans2 = 1;
    int checkIfEnd = 0;
    int ansKeyStart = 0;
    int[] ansInt = new int[2];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_1);

        yes = (Button) findViewById(R.id.yesBtn);


        oneButton = (TextView) findViewById(R.id.oneButtonn);
        twoButton = (TextView) findViewById(R.id.twoButtonn);

        qBox = (TextView)findViewById(R.id.QuestionBox);


        quizQuestions = getResources().getStringArray(R.array.Quiz_1_Questions_array);

        quizAnswers = getResources().getStringArray(R.array.Quiz_1_Answers_array);
//        String[] ansKey = quizAnswers.split(",");

        String[] quiz = {"Buzzfeed", "Personality Test", "Donald Trump or Clinton",
                "Jisu or Ali, hoo is cooler?", "I'm running out of ideas.."};


        updateTextView();
        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //updateTextView();
                ansKeyStart += ansInt[0];
                start++;
                ans1+= 2;
                ans2+=2;
                checkIfEnd++;
                updateTextView();

            }
        });

        twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //updateTextView();
                ansKeyStart += ansInt[1];
                start++;
                ans1+= 2;
                ans2+=2;
                checkIfEnd++;
                updateTextView();
            }
        });

        String[] answers = {"Yes", "NO"};


    }

//    public void moveString(int move) {
//
////        int newString = quizQuestions.length + move;
////
////        quizQuestions.length = newString;
////        qBox.setText(quizQuestions[newString]);
//
//        qBox.setText(quizQuestions[start]);
//
//    }

    @Override
    protected void onResume() {
        super.onResume();
        updateTextView();
    }



    public void updateTextView() {

        int maxIndex = quizQuestions.length;


        if (checkIfEnd < maxIndex) {

            qBox.setText(quizQuestions[start]);

            String[] temp = quizAnswers[ans1].split(",");
            ansInt[0] = Integer.parseInt(temp[1]);

            String[] temp2 = quizAnswers[ans2].split(",");
            ansInt[1] = Integer.parseInt(temp2[1]);

            oneButton.setText(temp[0]);
            twoButton.setText(temp2[0]);
        }

        else
            init2();

    }

    public void init2() {

            Intent go = new Intent(Quiz_1.this, Results.class);
            go.putExtra("resultss", String.valueOf(ansKeyStart));
            startActivity(go);

    }
}
