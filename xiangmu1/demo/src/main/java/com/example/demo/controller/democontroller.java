package com.example.demo.controller;

import com.example.demo.entity.demo;
import com.example.demo.service.demoservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
public class democontroller {
    @Autowired
    private demoservice demoservice;        
}
