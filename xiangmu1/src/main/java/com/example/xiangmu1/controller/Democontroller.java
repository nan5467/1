package com.example.xiangmu1.controller;

import com.example.xiangmu1.entity.Demo;
import com.example.xiangmu1.service.Demoservice;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Democontroller {
    @Resource
    private Demoservice demoservice;
    @PostMapping("/demo/add")
    public  long add(@RequestBody Demo demo){
        demoservice.save(demo);
        return demo.getId();
    }

    @GetMapping("/demo/list")
    public List<Demo> list(){
        return demoservice.list();
    }

    @PostMapping("/demo/update")
    public  long update(@RequestBody Demo demo){
        demoservice.updateById(demo);
        return demo.getId();
    }

    @PostMapping("/demo/del")
    public  String del(@RequestParam Long id){
        demoservice.removeById(id);
        return "success";
    }
}
