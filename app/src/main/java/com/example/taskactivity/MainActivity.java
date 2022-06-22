package com.example.taskactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    AppCompatButton btnSkipFirst;
    Button btnNextFirst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSkipFirst = findViewById(R.id.btnSkipFirst);
        btnNextFirst = findViewById(R.id.btnNextFirst);

        btnNextFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, Second_Screen.class);
                startActivity(intent1);


            }
        });
        btnSkipFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Sign_up_activity.class);
                startActivity(intent);
            }
        });

    }
}