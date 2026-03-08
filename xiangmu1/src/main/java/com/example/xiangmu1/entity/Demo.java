package com.example.xiangmu1.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("demo")
public class Demo {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String username;

    private String userpwd;

    private String name;

    private String sex;

    private String tel;

    private String good;
}
