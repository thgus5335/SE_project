package com.example.myapplication;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class JoinActivity extends AppCompatActivity {
    private ArrayAdapter adapter;
    private Spinner spinner;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        spinner = (Spinner) findViewById(R.id.join_reason);
        adapter = ArrayAdapter.createFromResource(this, R.array.join, android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

}
