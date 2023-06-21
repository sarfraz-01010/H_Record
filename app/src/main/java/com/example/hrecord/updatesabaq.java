package com.example.hrecord;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class UpdateSabaq extends AppCompatActivity {

    EditText rollno;
    Button proceed;
    boolean chk = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_updatesabaq);

        Intent intent = getIntent();

        rollno = findViewById(R.id.sabaqrollno);
        proceed = findViewById(R.id.next);