package com.cs2415.intentdemo;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView nameDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        nameDisplay = findViewById(R.id.textViewName);

        String receivedName = getIntent().getStringExtra("username");  // Receiving data
        nameDisplay.setText("Hello, " + receivedName + "!");
    }
}
