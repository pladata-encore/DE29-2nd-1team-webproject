package com.example.web_project.model.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.web_project.model.Entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String>{
    public UserEntity getByUserName(String userName);
}
