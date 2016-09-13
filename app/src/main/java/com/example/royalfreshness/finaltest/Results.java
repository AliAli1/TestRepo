package com.example.royalfreshness.finaltest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Results extends AppCompatActivity {

    TextView results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);



        results = (TextView) findViewById(R.id.RESULTS);

        Bundle extras = getIntent().getExtras();

        String value = extras.getString("resultss");

        results.setText(value);
    }
}
