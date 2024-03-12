package com.example.web_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1/web")
public class WebController {
    
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
