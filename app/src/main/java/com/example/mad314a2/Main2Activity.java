package com.example.mad314a2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView usernametextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        usernametextview = findViewById(R.id.textView1);

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        usernametextview.setText("Welcome student");
    }
}

