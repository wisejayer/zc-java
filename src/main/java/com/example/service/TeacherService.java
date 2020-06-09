package com.example.service;

import com.example.entity.LoginEntity;
import com.example.entity.UserEntity;
import com.example.mapper.TeacherMapper;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @email: 1418084893@qq.com
 * @author: wisejay
 */
@Service
public class TeacherService {
    @Autowired
    TeacherMapper teacherMapper;

    public List<UserEntity> getMonitor(){
        // 获取当前用户信息
        Subject subject = SecurityUtils.getSubject();
        LoginEntity loginInfo = (LoginEntity) subject.getPrincipal();
        //根据用户获取用户个人信息
        return  teacherMapper.getMonitor(String.valueOf(loginInfo.getUserid()));
    }

    public Integer add(UserEntity userEntity){
        return teacherMapper.add(userEntity);
    }

    public Integer delete(String userid){
        return  teacherMapper.delete(userid);
    }
}
