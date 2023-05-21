package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Product;

import com.example.demo.services.ProductService;


@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService service;
    
    @GetMapping
    public List<Product> findAll() {
       List<Product> list = service.findAll(); 
       return list;
    }

    @GetMapping(value ="/{id}")
    public Product findById(@PathVariable Long id) {
        Product obj = service.findById(id);
        return obj;
        
    }
    
}
