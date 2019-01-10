package com.codeup.springframeworkproject.controllers;

import com.codeup.springframeworkproject.models.Post;
import com.codeup.springframeworkproject.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/posts/create")
    public String showCreateForm(Model model) {
        model.addAttribute("post", new Post());
        return "posts/create";
    }

    @PostMapping("/posts/create")
    public String saveCreateForm(Post post) {
        postService.create(post);
        return "redirect:/posts";
    }

    @GetMapping("/posts/{id}/edit")
    public String showEditForm(@PathVariable int id, Model model) {
        model.addAttribute("post", postService.getPostById(id));
        return "posts/edit";
    }

    @PostMapping("/posts/${id}/edit")
    public String saveEditForm(@ModelAttribute Post post){
        postService.editPost(post);
        return "redirect:/posts/" + post.getId();
    }
}
