package com.example.hrecord;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button github, homeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        github = findViewById(R.id.button2);
        homeButton = findViewById(R.id.button1);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Home.class);
                startActivity(intent);
            }
        });

        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://github.com/sarfraz-01010";

                // Create an intent with ACTION_VIEW and the URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

                // Verify if there's an activity that can handle the intent
                if (intent.resolveActivity(getPackageManager()) != null) {
                    // Start the activity to open the URL
                    startActivity(intent);
                }
            }
        });

    }
}