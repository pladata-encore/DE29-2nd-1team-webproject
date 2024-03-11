package com.example.web_project.model.DAO;

import java.util.List;

import com.example.web_project.model.Entity.PostEntity;

public interface PostDao {
    // select
    public PostEntity getByPostId(Long postId);

    public List<PostEntity> getAllPost();

    // insert
    public void insertPost(PostEntity entity);

    // update
    public void updatePost(PostEntity entity);

    // delete
    public void deletePost(Long postId);
}
