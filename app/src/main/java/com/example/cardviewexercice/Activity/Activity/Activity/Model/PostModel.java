package com.example.cardviewexercice.Activity.Activity.Activity.Model;

public class PostModel {
    private String name;
    private String title;
    private int image;

    public PostModel() {
    }

    public PostModel(String name, String post, int image) {
        this.name = name;
        this.title = post;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
