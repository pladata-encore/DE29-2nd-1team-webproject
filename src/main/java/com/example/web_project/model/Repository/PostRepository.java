package com.example.web_project.model.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.web_project.model.Entity.PostEntity;

public interface PostRepository extends JpaRepository<PostEntity, Long>{
    public PostEntity getByPostId(Long postId);
}
