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

    // 로그인 성공 시 >> 로그인 유무 저장
    public void updateIsLoginByName(String name, Boolean isLogin);

    // 권한 적용
    public void joinUserDto(UserDto dto);
}
