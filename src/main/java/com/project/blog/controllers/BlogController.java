package com.project.blog.controllers;

import com.project.blog.models.Article;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.project.blog.repo.ArticleRepo;

@Controller
public class BlogController {

    @Autowired
    private ArticleRepo artickeRepo;

    @GetMapping("/blog")
    public String blogMain(Model model) {
        Iterable <Article> posts = artickeRepo.findAll();
        model.addAttribute("posts", posts);
        return "blog-main";
    }

}