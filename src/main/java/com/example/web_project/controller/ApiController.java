package com.example.web_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.web_project.model.DTO.PostDto;
import com.example.web_project.model.DTO.UserDto;
import com.example.web_project.service.PostService;
import com.example.web_project.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/web")
public class ApiController {
    
    @Autowired
    private UserService userService;
    
    @Autowired
    private PostService postService;

    /* User */
    @PostMapping("/insertUser")
    public String insertUser(@Valid @RequestBody UserDto dto){
        userService.insertUser(dto);
        return "유저 추가 성공";
    }

    @GetMapping("/getUser")
    public String getUser(@Valid @RequestParam String userName) {
        UserDto dto = userService.getByUserName(userName);
        return dto.toString();
    }

    /* Post */
    @PostMapping("/insertPost")
    public String insertPost(@Valid @RequestBody PostDto dto,MultipartFile file) throws Exception{
        
    
        postService.insertPost(dto,file);

        return "게시물 추가 성공"+ file.toString();
    }

    @GetMapping("/getPost")
    public String getPost(@Valid @RequestParam Long postId) {
        PostDto dto = postService.getByPostId(postId);
        return dto.toString();
    }
    

}
