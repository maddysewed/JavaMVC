package com.project.blog.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.blog.models.Post;

public interface PostRepo extends JpaRepository <Post, Long> {

}