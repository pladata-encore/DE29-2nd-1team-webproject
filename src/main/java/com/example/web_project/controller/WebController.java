package com.example.web_project.controller;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.example.web_project.model.DTO.PostDto;
import com.example.web_project.service.PostService;
import com.example.web_project.service.impl.PostServiceImpl;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestParam;


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

    @PostMapping("/insertpost")
    public String insertPost(@Valid @ModelAttribute PostDto dto,MultipartFile file) throws Exception{
        
        Date now = new Date();
        dto.setPostDate(now);
        
        dto.setPostWriter(String.valueOf(Math.random()));
        postService.insertPost(dto,file);

        return "/bootstrapMain/index";
    }

    @GetMapping("/insertpost")
    public String insertPost() {
        return "/bootstrapPost/writeform";
    }

    @GetMapping("/login")
    public String login(){
        return "/bootstrapMain/login";
    }

    @GetMapping("/view")
    public String view(Model model) {

        
        PostDto dto= postService.getByPostId((long) 102);

        System.out.println(dto.toString());

        model.addAttribute("postWriter",dto.getPostWriter());
        model.addAttribute("postTitle",dto.getPostTitle());
        model.addAttribute("postContent",dto.getPostContent());
        model.addAttribute("postFilePath",dto.getPostFilePath());
        
        

        return "/bootstrapPost/view";
    }

    @GetMapping("/list")
    public String boardList(Model model) {
        model.addAttribute("lt", postService.getAllPost());
        return "/bootstrapPost/boardList";
    }

    @GetMapping("/write")
    public String getWrite() {
        return "/bootstrapWrite/write";
    }

    
    @GetMapping("/signup")
    public String getSignup() {
        return "/bootstrapMain/signup";
    }


    
}
