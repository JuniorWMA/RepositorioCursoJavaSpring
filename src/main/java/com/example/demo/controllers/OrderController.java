package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Order;

import com.example.demo.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {
    
    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<Order> findAll() {
        var list = orderService.findAll();
        return list;
    }

    @GetMapping(value = "/{id}")
    public Order findById(@PathVariable Long id) {
       var result = orderService.findById(id);
       return result;
    }
}
