package com.geekster.sqldemo.controller;

import com.geekster.sqldemo.dao.PostRepo;
import com.geekster.sqldemo.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {
    @Autowired
    PostRepo postRepo;

    @PostMapping(value = "/post")
    public String saveProduct(@RequestBody Post post){
        postRepo.save(post);
        return "post saved";
    }
    @GetMapping(value = "/product")
    public List<Post> getList(){
        return postRepo.findAll();
    }
}
