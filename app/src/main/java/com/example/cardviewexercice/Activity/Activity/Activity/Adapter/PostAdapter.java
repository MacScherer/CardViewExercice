package com.example.cardviewexercice.Activity.Activity.Activity.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cardviewexercice.Activity.Activity.Activity.Model.PostModel;
import com.example.cardviewexercice.R;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.MyViewHolder>{
    private List<PostModel> postModelList;
    public PostAdapter(List<PostModel>listPost) {
        this.postModelList = listPost;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemList = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_detail,parent,false);
        return new MyViewHolder(itemList);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        PostModel postModel = postModelList.get(position);
        holder.textViewUserName.setText(postModel.getName());
        holder.textViewTitle.setText(postModel.getTitle());
        holder.imageViewPhoto.setImageResource(postModel.getImage());
    }

    @Override
    public int getItemCount() {
        return postModelList.size();
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
