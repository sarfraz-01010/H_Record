package com.example.hrecord;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class seeRecord extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerViewAdapter2 adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see_record);
        Intent intent = getIntent();

        String iid = intent.getStringExtra("roll");
    }
}