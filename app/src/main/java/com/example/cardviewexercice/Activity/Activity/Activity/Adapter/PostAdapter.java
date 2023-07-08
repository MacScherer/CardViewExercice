package com.example.cardviewexercice.Activity.Activity.Activity.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cardviewexercice.R;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.MyViewHolder>{

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemList = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_detail,parent,false);
        return new MyViewHolder(itemList);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.textViewUserName.setText("Vinicius Scherer");
        holder.textViewTitle.setText("#tbt Partiu torres gemeas");
        holder.imageViewPhoto.setImageResource(R.drawable.imagem1);
    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView textViewUserName;
        private ImageView imageViewPhoto;
        private TextView textViewTitle;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewUserName = itemView.findViewById(R.id.textViewUserName);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            imageViewPhoto = itemView.findViewById(R.id.imageViewPost);
        }
    }
}
