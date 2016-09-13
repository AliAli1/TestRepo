package com.example.royalfreshness.finaltest;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Complete_Main extends AppCompatActivity {

    Button incbtn_2;

    public void init() {


        incbtn_2 = (Button) findViewById(R.id.incbtn_2);
        incbtn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent go = new Intent(Complete_Main.this, Incomplete_Main.class);
                startActivity(go);
            }


        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete__main);

        init();
    }


}
