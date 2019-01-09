package com.codeup.springframeworkproject.Models;

public class Post {
    private String title;
    private String body;

    private static Post[] posts = {
            new Post("anonymous", "Programming is a way of thinking"),
            new Post("Dolly Parton", "We cannot direct the wind, but we can adjust the sails."),
    };

    public Post(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public static Post[] getPosts() {
        return posts;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
