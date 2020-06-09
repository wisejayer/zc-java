package com.example.controller;

import com.example.entity.NavEntity;
import com.example.service.NavService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @email: 1418084893@qq.com
 * @author: wisejay
 */
@RestController
public class NavController {
@Autowired
NavService navService;

    @GetMapping("/menu")
    public List<NavEntity> menu(){
        return  navService.getNav();        //获取导航
    }
}
