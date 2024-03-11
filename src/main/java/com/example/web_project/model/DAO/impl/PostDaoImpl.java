package com.example.web_project.model.DAO.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.web_project.model.DAO.PostDao;
import com.example.web_project.model.Entity.PostEntity;
import com.example.web_project.model.Repository.PostRepository;

@Service
public class PostDaoImpl implements PostDao{

    @Autowired
    private PostRepository postRepository;

    @Override
    public void deletePost(Long postId) {
        // TODO Auto-generated method stub
        postRepository.deleteById(postId);
    }

    @Override
    public List<PostEntity> getAllPost() {
        // TODO Auto-generated method stub
        return postRepository.findAll();
    }

    @Override
    public PostEntity getByPostId(Long postId) {
        // TODO Auto-generated method stub
        return postRepository.getByPostId(postId);
    }

    @Override
    public void insertPost(PostEntity entity) {
        // TODO Auto-generated method stub
        postRepository.save(entity);
    }

    @Override
    public void updatePost(PostEntity entity) {
        // TODO Auto-generated method stub
        postRepository.save(entity);
    }
    
}
