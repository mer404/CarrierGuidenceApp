package com.example.taskactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toolbar;

public class DashBoardActivity extends AppCompatActivity {
    Toolbar toolbarA;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        webView = findViewById(R.id.webView);
        web();

        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbarA);
        setSupportActionBar(toolbar);

    }

    public void web() {
        webView.loadUrl("https://youtu.be/EplH-amHTtE");
    }

    public boolean onCreateOptionsMenu(Menu Menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_for_menu, Menu);
        return true;
    }

}

