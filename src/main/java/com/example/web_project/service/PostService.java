package com.example.web_project.service;

import java.util.List;

import com.example.web_project.model.DTO.PostDto;

public interface PostService {
    // select
    public PostDto getByPostId(Long postId);

    public List<PostDto> getAllPost();

    // insert
    public void insertPost(PostDto dto);

    // update
    public void updatePost(PostDto dto);

    // delete
    public void deletePost(Long postId);
}
