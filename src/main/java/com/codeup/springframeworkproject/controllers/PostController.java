package com.codeup.springframeworkproject.controllers;

import com.codeup.springframeworkproject.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PostController {

    private PostService postService;

    public PostController(PostService ps) {
        this.postService = ps;
    }

    @GetMapping("/posts")
    public String index(Model model) {
        model.addAttribute("posts", postService.allPosts());
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String show(@PathVariable int id, Model model) {
        model.addAttribute("post", postService.getPostById(id));
        return "posts/show";
    }

//    @GetMapping("/posts/create")
//    @ResponseBody
//    public String create() {
//        return "View the form for creating a post";
//    }

//    @PostMapping("/posts")
//    @ResponseBody
//    public String save() {
//        return "Handle the POST request for saving a new blog post";
//    }
}
