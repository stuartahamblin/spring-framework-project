package com.codeup.springframeworkproject.controllers;

import com.codeup.springframeworkproject.Models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;

@Controller
public class PostController {

    @GetMapping("/posts")
    public String index(Model model) {
        Post firstPost = new Post("Class is cool", "Its not bad");
        Post secondPost = new Post("Class sucks", "Its okay");
        ArrayList<Post> postArray = new ArrayList<>();
        postArray.add(firstPost);
        postArray.add(secondPost);
        model.addAttribute("posts", postArray);
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String show(@PathVariable long id, Model model) {
        Post individualPost = new Post("Almost done", "yup");
        model.addAttribute("post", individualPost);
        return "posts/show";
    }
//
//    @GetMapping("/posts/create")
//    public String create() {
//        return "View the form for creating a post";
//    }
//
//    @PostMapping("/posts")
//    public String save() {
//        return "Handle the POST request for saving a new blog post";
//    }
}
