package com.spring.hotblog.service.serviceimpl;

import com.spring.hotblog.model.Post;
import com.spring.hotblog.repository.HotBlogRepository;
import com.spring.hotblog.service.HotBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class hotblogServiceImpl implements HotBlogService {

    @Autowired
    HotBlogRepository hotBlogRepository;

    @Override
    public List<Post> findAll() {
        return hotBlogRepository.findAll();
    }

    @Override
    public Post findById(long id) {
        return hotBlogRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return hotBlogRepository.save(post);
    }
}
