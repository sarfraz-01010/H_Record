package com.example.hrecord;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class updateSabaq2 extends AppCompatActivity {

    EditText sabaqSurah, sabaqStart, sabaqEnd, sabqi, manzil;
    Button save;

    //SabaqDbHelper sabaqDbHelper;
    StudentsDbHelper studentsDbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_updatesabaq2);

        Intent intent = getIntent();
        String rollno = intent.getStringExtra("rollno");

        sabaqSurah = findViewById(R.id.sabaqSurah);
        sabaqStart = findViewById(R.id.sabaqStart);
        sabaqEnd = findViewById(R.id.sabaqEnd);
        sabqi = findViewById(R.id.sabqiSurah);
        manzil = findViewById(R.id.manzilSurah);
        save = findViewById(R.id.save);