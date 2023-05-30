package com.leo.intentaa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getButton().setOnClickListener(this::onClick);
    }

    Button getButton() {
        Button button = findViewById(R.id.btn);
        return button;
    }

    void onClick(View view) {
        int viewId = view.getId();
        if (viewId == R.id.btn) {
            Intent intent = new Intent(MainActivity.this, SecActivity.class);
            startActivity(intent);
        }
    }
}