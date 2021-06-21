package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import java.text.BreakIterator;

public class LoginActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final Button loginButton = (Button) findViewById(R.id.loginButton);
        final Button join1Button = (Button) findViewById(R.id.join1Button);
        final Button idButton = (Button) findViewById(R.id.idButton);
        final Button pwButton = (Button) findViewById(R.id.pwButton);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.join1Button:
                        Intent intent = new Intent(LoginActivity.this,JoinActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.idButton: ;
                        break;
                    case R.id.pwButton:
                        break;
                }
            }
        };

        loginButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                String userID = ((EditText) findViewById(R.id.idText)).getText().toString();
                String password = ((EditText) findViewById(R.id.pwText)).getText().toString();

                Intent intent = new Intent(LoginActivity.this,JoinActivity.class);

            }

        });

        join1Button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
            }

        });

        idButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
            }

        });

        pwButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
            }

        });
    }

}
