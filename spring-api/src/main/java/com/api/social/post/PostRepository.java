package com.api.social.post;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, String> {
    public List<Post> getPostByUserId(String id);
}
