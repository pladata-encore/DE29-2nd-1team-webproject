package com.example.web_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.web_project.service.impl.PostServiceImpl;


@Controller
@RequestMapping("/v1/web")
public class WebController {
    
    @Autowired
    private PostServiceImpl postService;


    @GetMapping("/index")
    public String getIndex(){
        return "/bootstrapMain/index";
    }

    @GetMapping("/post")
    public String getPost() {
        return "/bootstrapPost/post";
    }
    @GetMapping("/write")
    public String getWrite() {
        return "/bootstrapWrite/write";
    }
}
