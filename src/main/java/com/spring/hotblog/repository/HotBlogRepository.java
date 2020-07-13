package com.spring.hotblog.repository;

import com.spring.hotblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotBlogRepository extends JpaRepository<Post, Long> {
}
