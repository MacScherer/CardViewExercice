package com.example.cardviewexercice.Activity.Activity.Activity.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cardviewexercice.R;

import java.util.List;

public class AdapterPost extends RecyclerView.Adapter<AdapterPost.MyViewHolder> {

    @NonNull
    @Override
    public AdapterPost.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         View listItem = LayoutInflater.from(parent.getContext())
                 .inflate(R.layout.adapter_list, parent, false);
         return new MyViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterPost.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textViewUserName;
        TextView textViewPostTitle;
        ImageView imageViewPhoto;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewUserName = itemView.findViewById(R.id.textViewUserName);
            textViewPostTitle = itemView.findViewById(R.id.recyclerViewPost);
            imageViewPhoto = itemView.findViewById(R.id.imageViewPost);
        }
    }
}
