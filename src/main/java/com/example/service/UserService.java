package com.example.service;

import com.example.entity.LoginEntity;
import com.example.entity.UserEntity;
import com.example.mapper.UserMapper;
import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @email: 1418084893@qq.com
 * @author: wisejay
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public UserEntity getUser(){
        // 获取当前用户信息
        Subject subject = SecurityUtils.getSubject();
        LoginEntity loginInfo = (LoginEntity) subject.getPrincipal();
        //根据用户获取用户个人信息
        return userMapper.getUser(String.valueOf(loginInfo.getUserid()));
    }
}
