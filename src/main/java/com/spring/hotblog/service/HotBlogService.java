package com.spring.hotblog.service;

import com.spring.hotblog.model.Post;

import java.util.List;

public interface HotBlogService {

    List<Post> findAll();
    Post findById(long id);
    Post save (Post post);
}
