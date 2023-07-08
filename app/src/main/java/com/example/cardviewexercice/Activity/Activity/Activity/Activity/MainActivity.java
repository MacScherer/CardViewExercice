package com.example.cardviewexercice.Activity.Activity.Activity.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cardviewexercice.Activity.Activity.Activity.Adapter.PostAdapter;
import com.example.cardviewexercice.Activity.Activity.Activity.Model.PostModel;
import com.example.cardviewexercice.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewPost;
    private List<PostModel> postList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewPost = findViewById(R.id.recyclerViewPost);

        //CREATE LAYOUT
        RecyclerView.LayoutManager layoutManagerPost = new LinearLayoutManager(this);
        recyclerViewPost.setLayoutManager(layoutManagerPost);


        //CREATE ADAPTER
        this.preparePost();

        PostAdapter adapter = new PostAdapter(postList);
        recyclerViewPost.setAdapter(adapter);

    }
    public void preparePost(){
        //COULD CALL POST FROM DB
        PostModel p = new PostModel("MacScherer", "#tbt Nice View", R.drawable.imagem1);
        this.postList.add(p);

        p = new PostModel("Snow", "#I miss my home haha", R.drawable.imagem2);
        this.postList.add(p);

        p = new PostModel("Lecka", "#tbt What a nice day", R.drawable.imagem3);
        this.postList.add(p);

        p = new PostModel("Ana", "I miss my old friends", R.drawable.imagem4);
        this.postList.add(p);
    }
}