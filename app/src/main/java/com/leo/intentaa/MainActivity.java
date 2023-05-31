package com.leo.intentaa;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getButton().setOnClickListener(this::onClick);
    }

    Button getButton() {
        Button button = findViewById(R.id.button);
        return button;
    }

    void onClick(View view) {
        int viewId = view.getId();
        if (viewId == R.id.button) {
            EditText editText1=findViewById(R.id.edittext);
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:"));
            intent.putExtra(Intent.EXTRA_EMAIL,new String[]{editText1.getText().toString()});
            intent.putExtra(Intent.EXTRA_SUBJECT, "I want one day leave");
            intent.putExtra(Intent.EXTRA_TEXT, "I am having fever");
            startActivity(intent);
        }
    }
}