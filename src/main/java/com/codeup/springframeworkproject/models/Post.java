package com.codeup.springframeworkproject.models;

public class Post {
    private String title;
    private String body;
    private int id;

//    private static Post[] posts = {
//            new Post("anonymous", "Programming is a way of thinking"),
//            new Post("Dolly Parton", "We cannot direct the wind, but we can adjust the sails."),
//    };

//    public static Post[] getPosts() {
//        return posts;
//    }

    public Post(String title, String body, int id) {
        this.title = title;
        this.body = body;
        this.id = id;
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
