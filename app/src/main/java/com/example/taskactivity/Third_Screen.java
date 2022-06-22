package com.example.taskactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Third_Screen extends AppCompatActivity {
    Button btnNextFirst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_screen);
        btnNextFirst = findViewById(R.id.btnNextFirst);

        btnNextFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(Third_Screen.this, Sign_up_activity.class);
                startActivity(intent4);

            }
        });
    }
}