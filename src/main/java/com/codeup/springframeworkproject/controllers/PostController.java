package com.codeup.springframeworkproject.controllers;

import com.codeup.springframeworkproject.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {
        List<Post> posts = new ArrayList<>();

    @GetMapping("/posts")
    public String index(Model model) {
        posts.add(new Post("New post 1", "lorem impsum dolor set amit", 1));
        posts.add(new Post("New post 2", "lorem impsum dolor set amit",2));
        posts.add(new Post("New post 3", "lorem impsum dolor set amit",3));
        posts.add(new Post("New post 4", "lorem impsum dolor set amit",4));
        model.addAttribute("posts", posts);
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String show(@PathVariable int id, Model model) {
        Post post = posts.get(id+1);
//        SEE pushed code
        model.addAttribute("post", post);
        model.addAttribute("id", id);
        return "posts/show";
    }

//    @GetMapping("/posts/create")
//    @ResponseBody
//    public String create() {
//        return "View the form for creating a post";
//    }
//
//    @PostMapping("/posts")
//    @ResponseBody
//    public String save() {
//        return "Handle the POST request for saving a new blog post";
//    }
}
