package com.example.royalfreshness.finaltest;

import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.app.ActionBar;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Incomplete_Main extends AppCompatActivity {


    Button comp_1;

    public void init() {

        comp_1 = (Button) findViewById(R.id.combtn_2);
        comp_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent go = new Intent(Incomplete_Main.this, Complete_Main.class);
                startActivity(go);
            }
        });

    }

    ActionBar.Tab Tab1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incomplete__main);


        String[] quiz = {"Buzzfeed", "Personality Test", "Donald Trump or Clinton",
                "Jisu or Ali, hoo is cooler?", "I'm running out of ideas.."};
        ListAdapter QuizAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, quiz);
        ListView EeveesListView = (ListView) findViewById(R.id.EeveeListView);
        EeveesListView.setAdapter(QuizAdapter);


        EeveesListView .setOnItemClickListener(
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String quizItemNumber = String.valueOf(parent.getItemAtPosition(position));

                    }
                }
        );

        EeveesListView .setOnItemClickListener(
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String quizItemNumber = String.valueOf(parent.getItemAtPosition(position));

                        Toast.makeText(Incomplete_Main.this, quizItemNumber, Toast.LENGTH_LONG).show();

                        if (position == 0) {
                            Intent firstQuizGo = new Intent(Incomplete_Main.this, Quiz_1.class);
                            startActivity(firstQuizGo);

                        }


                    }
                });
        }


}
