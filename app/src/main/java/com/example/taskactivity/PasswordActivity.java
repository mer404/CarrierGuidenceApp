package com.example.taskactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.SaveInfo;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PasswordActivity extends AppCompatActivity {
    EditText edtCreatePassword;
    Button btnSavePassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
        edtCreatePassword = findViewById(R.id.edtCreatePassword);
        btnSavePassword = findViewById(R.id.btnSavePassword);

        String savePass = edtCreatePassword.getText().toString();

        btnSavePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(PasswordActivity.this, LoginActivity.class);
                intent.putExtra("Saved PassWord", savePass);
                startActivity(intent);
                finish();
            }
        });
    }
}