package com.example.taskactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Second_Screen extends AppCompatActivity {
    AppCompatButton btnSkipSecond;
    Button btnNextSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        btnSkipSecond = findViewById(R.id.btnSkipSecond);
        btnNextSecond = findViewById(R.id.btnNextSecond);

        btnSkipSecond.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent2 = new Intent(Second_Screen.this, Sign_up_activity.class);
                startActivity(intent2);


            }
        });
        btnNextSecond.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent3 = new Intent(Second_Screen.this, Third_Screen.class);
                startActivity(intent3);
            }
        });
    }
}