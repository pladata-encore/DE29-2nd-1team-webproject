package com.example.web_project.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.web_project.model.DAO.UserDao;
import com.example.web_project.model.DTO.UserDto;
import com.example.web_project.model.Entity.UserEntity;
import com.example.web_project.service.UserService;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public void deleteUser(String userId) {
        // TODO Auto-generated method stub
        userDao.deleteUser(userId);
    }

    @Override
    public List<UserDto> getAllUser() {
        // TODO Auto-generated method stub

        List<UserEntity> userList = userDao.getAllUser();
        List<UserDto> dtoList = new ArrayList<>();
        for(UserEntity user : userList) {
            UserDto dto = new UserDto();
            dto.setUserId(user.getUserId());
            dto.setUserName(user.getUserName());
            dto.setUserPw(user.getUserPw());
            dto.setUserAge(user.getUserAge());
            dto.setUserEmail(user.getUserEmail());
            dto.setUserAddress(user.getUserAddress());

            dtoList.add(dto);
        }
        return dtoList;
    }

    @Override
    public UserDto getByUserName(String userName) {
        // TODO Auto-generated method stub
        UserEntity user = userDao.getByUserName(userName);
        UserDto dto = new UserDto();

        dto.setUserId(user.getUserId());
        dto.setUserName(user.getUserName());
        dto.setUserPw(user.getUserPw());
        dto.setUserAge(user.getUserAge());
        dto.setUserEmail(user.getUserEmail());
        dto.setUserAddress(user.getUserAddress());
        
        return dto;
    }

    @Override
    public void insertUser(UserDto dto) {
        // TODO Auto-generated method stub
        UserEntity entity = new UserEntity();
        entity.setUserId(dto.getUserId());
        entity.setUserName(dto.getUserName());
        entity.setUserPw(dto.getUserPw());
        entity.setUserEmail(dto.getUserEmail());
        entity.setUserAddress(dto.getUserAddress());
        entity.setUserAge(dto.getUserAge());

        userDao.insertUser(entity);
    }

    @Override
    public void updateUser(UserDto dto) {
        // TODO Auto-generated method stub
        UserEntity entity = userDao.getByUserName(dto.getUserName());
        entity.setUserName(dto.getUserName());
        entity.setUserPw(dto.getUserPw());
        entity.setUserEmail(dto.getUserEmail());
        entity.setUserAddress(dto.getUserAddress());
        entity.setUserAge(dto.getUserAge());
        
        userDao.updateUser(entity);
    }
    
}
