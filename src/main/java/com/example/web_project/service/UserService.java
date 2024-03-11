package com.example.web_project.service;

import java.util.List;

import com.example.web_project.model.DTO.UserDto;

public interface UserService {
    // select
    public UserDto getByUserName(String userName);

    public List<UserDto> getAllUser();

    // insert
    public void insertUser(UserDto dto);

    // update
    public void updateUser(UserDto dto);

    // delete
    public void deleteUser(String userId);
}
