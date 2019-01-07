package com.codeup.springframeworkproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {
    @ResponseBody
    @GetMapping("/posts")
    public String index() {
        return "posts index page";
    }

    @GetMapping("/posts/create")
    public String create() {
        return "View the form for creating a post";
    }

    @GetMapping("/posts/{id}")
    public String index(@PathVariable long id) {
        return "view an individual post with id of:" + id;
    }

    @PostMapping("/posts")
    public String save() {
        return "I just saved a new post";
    }
}
//        GET	/posts	posts index page
//        GET	/posts/{id}	view an individual post
//        GET	/posts/create	view the form for creating a post
//        POST	/posts/create
