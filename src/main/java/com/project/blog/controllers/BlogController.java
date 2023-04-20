package com.project.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.project.blog.repo.PostRepo;

@Controller
public class BlogController {

    @Autowired
    private PostRepo postRepo;

    @GetMapping("/blog")
    public String blogMain(Model model) {
        model.addAttribute("title", "Блог сайта");
        return "blog-main";
    }

}