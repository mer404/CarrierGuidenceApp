package com.example.taskactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {

    AppCompatButton btnSignUPSecond, btnForgotPassword;
    Button btnSignUpOne;
    EditText edtPasswordSignUp;
    private TextInputEditText edtEmailSignUp;
    String emailValid = "@gmail.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnSignUPSecond = findViewById(R.id.btnSignUPSecond);
        edtEmailSignUp = findViewById(R.id.edtEmailSignUp);
        edtPasswordSignUp = findViewById(R.id.edtPasswordSignUp);
        btnForgotPassword = findViewById(R.id.btnForgotPassword);
        btnSignUpOne = findViewById(R.id.btnSignUpOne);

        String edtEmail = edtEmailSignUp.getText().toString();
        String edtPassword = edtPasswordSignUp.getText().toString();
        if (getIntent() != null) {
            edtEmail = getIntent().getStringExtra("edtEmail");
            edtPassword = getIntent().getStringExtra("edtPassword");
        }


        edtEmailSignUp.setText(edtEmail);
        edtPasswordSignUp.setText(edtPassword);
        btnSignUpOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailLogin = edtEmailSignUp.getText().toString();
                String passwordLogin = edtPasswordSignUp.getText().toString();
                if (emailLogin.isEmpty()) {

                    Toast.makeText(LoginActivity.this, "Please Enter Email", Toast.LENGTH_SHORT).show();
                } else if (!emailLogin.endsWith(emailValid)) {
                    Toast.makeText(LoginActivity.this, "Invalid Email", Toast.LENGTH_SHORT).show();
                } else if (passwordLogin.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Enter Password", Toast.LENGTH_SHORT).show();
                } else if (!(passwordLogin.length() < 10)) {
                    Toast.makeText(LoginActivity.this, "Please Enter Maximum 10 Digits Password", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(LoginActivity.this, DashBoardActivity.class);
                    startActivity(intent);
                }
            }
        });

        btnForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, PasswordActivity.class);
                startActivity(intent);
            }
        });

        btnSignUPSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, Sign_up_activity.class);
                startActivity(intent);
            }
        });
    }
}