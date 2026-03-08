package com.example.xiangmu1.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.xiangmu1.entity.Demo;
import com.example.xiangmu1.mapper.Demomapper;
import com.example.xiangmu1.service.Demoservice;
import org.springframework.stereotype.Service;

@Service
public class Demoservicelmpl extends ServiceImpl<Demomapper, Demo> implements Demoservice {
}
