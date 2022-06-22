package com.example.taskactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

public class Sign_up_activity extends AppCompatActivity {
    EditText edtNameSignUp, edtEmailSignUp, edtPasswordSignUp;
    Button btnSignUpOne;
    AppCompatButton btnLoginOne;
    String emailValid = "@gmail.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        edtEmailSignUp = findViewById(R.id.edtEmailSignUp);
        edtNameSignUp = findViewById(R.id.edtNameSignUp);
        edtPasswordSignUp = findViewById(R.id.edtPasswordSignUp);
        btnSignUpOne = findViewById(R.id.btnSignUpOne);
        btnLoginOne = findViewById(R.id.btnLoginOne);


        btnLoginOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sign_up_activity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        btnSignUpOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edtName = edtNameSignUp.getText().toString();
                String edtEmail = edtEmailSignUp.getText().toString();
                String edtPassword = edtPasswordSignUp.getText().toString();

                if (edtName.isEmpty()) {
                    Toast.makeText(Sign_up_activity.this, "Please Enter Your Name", Toast.LENGTH_SHORT).show();
                } else if (edtEmail.isEmpty()) {
                    Toast.makeText(Sign_up_activity.this, "Please Enter Your Email", Toast.LENGTH_SHORT).show();
                } else if (!edtEmail.endsWith(emailValid)) {
                    Toast.makeText(Sign_up_activity.this, "Please Enter Valid Email Address", Toast.LENGTH_SHORT).show();
                } else if (edtPassword.isEmpty()) {
                    Toast.makeText(Sign_up_activity.this, "Please Enter Password", Toast.LENGTH_SHORT).show();
                } else if (!(edtPassword.length() < 10)) {
                    Toast.makeText(Sign_up_activity.this, "Please Enter Maximum 10 Digits Password", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(Sign_up_activity.this, LoginActivity.class);
                    intent.putExtra("edtEmail", edtEmail);
                    intent.putExtra("edtPassword", edtPassword);
                    startActivity(intent);
                }

            }
        });

    }
}