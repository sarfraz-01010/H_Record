package com.example.hrecord;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyVH> {
    List<Student> students;
    public class RecyclerViewAdapter(List<Student> students)
    {
        this.students = students;
    }
    @NonNull
    @Override

}
