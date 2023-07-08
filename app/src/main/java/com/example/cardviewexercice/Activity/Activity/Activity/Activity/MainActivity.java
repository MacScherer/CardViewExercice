package com.example.cardviewexercice.Activity.Activity.Activity.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cardviewexercice.R;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewPost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewPost = findViewById(R.id.recyclerViewPost);

        //CREATE LAYOUT
        RecyclerView.LayoutManager layoutManagerPost = new LinearLayoutManager(this);
        recyclerViewPost.setLayoutManager(layoutManagerPost);


        //CREATE ADAPTER
    }
}