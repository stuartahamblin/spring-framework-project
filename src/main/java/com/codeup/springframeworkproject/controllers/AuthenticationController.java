package com.codeup.springframeworkproject.controllers;

import com.codeup.springframeworkproject.models.User;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthenticationController {

    @GetMapping("/login")
    public String showLoginForm() {
        return "users/login";
    }

    @PostMapping("/login")
    public String userLogin() {
//        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return "redirect:/posts";
    }

}
