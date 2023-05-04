package com.project.blog.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.blog.models.Article;

public interface ArticleRepo extends JpaRepository <Article, Long> {

}