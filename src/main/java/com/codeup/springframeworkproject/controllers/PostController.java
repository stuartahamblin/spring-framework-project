package com.codeup.springframeworkproject.controllers;

import com.codeup.springframeworkproject.models.Post;
import com.codeup.springframeworkproject.models.User;
import com.codeup.springframeworkproject.repositories.UserRepository;
import com.codeup.springframeworkproject.services.PostService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    private final UserRepository userRepo;
    private PostService postService;

    public PostController(PostService ps, UserRepository userRepo) {
        this.postService = ps;
        this.userRepo = userRepo;

    }

    @GetMapping("/posts")
    public String index(Model model) {
        model.addAttribute("posts", postService.allPosts());
//        System.out.println("There are " + userRepo.count() + "users");
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String show(@PathVariable int id, Model model) {
        Post currentPost = postService.getPostById(id);
        model.addAttribute("post", currentPost);
        model.addAttribute("id", id);
        return "posts/show";
    }

    @GetMapping("/posts/create")
    public String showCreateForm(Model model) {
        model.addAttribute("post", new Post());
        return "posts/create";
    }

    @PostMapping("/posts/create")
    public String saveCreateForm(Post post) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        post.setUser(user);
        postService.create(post);
        return "redirect:/posts";
    }

    @GetMapping("/posts/{id}/edit")
    public String showEditForm(@PathVariable int id, Model model) {
        model.addAttribute("post", postService.getPostById(id));
        return "posts/edit";
    }

    @PostMapping("/posts/{id}/edit")
    public String editPost(@ModelAttribute Post post) {
//        String page = Integer.toString(post.getId());
        postService.edit(post);
        return "redirect:/posts";
    }

//    @PostMapping("/posts/{id}/delete")
//    public String deletePost(@PostMapping int id){
//        po
//    }
}
