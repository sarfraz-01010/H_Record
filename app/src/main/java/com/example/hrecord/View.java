package com.example.hrecord;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class View extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        Intent intent = getIntent();

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);

        StudentsDbHelper studentsDbHelper = new StudentsDbHelper(this);
        SQLiteDatabase db = studentsDbHelper.getWritableDatabase();

        List<Student> students = studentsDbHelper.selectAllStudents();

        recyclerView.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapter(students);
        recyclerView.setAdapter(adapter);
    }
}
