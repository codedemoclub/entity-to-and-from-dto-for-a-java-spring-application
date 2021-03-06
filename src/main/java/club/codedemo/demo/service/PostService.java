package club.codedemo.demo.service;

import club.codedemo.demo.entity.Post;

import java.util.List;

public interface PostService {
    List<Post> findAll();

    Post save(Post post);

    Post findById(Long id);

}
