package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Category;
import com.example.demo.entities.User;
import com.example.demo.services.CategoryService;
import com.example.demo.services.UserService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {

    @Autowired
    private CategoryService service;
    
    @GetMapping
    public List<Category> findAll() {
       List<Category> list = service.findAll(); 
       return list;
    }

    @GetMapping(value ="/{id}")
    public Category findById(@PathVariable Long id) {
        Category obj = service.findById(id);
        return obj;
        
    }
    
}
