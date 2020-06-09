package com.example.service;

import com.example.entity.GradeEntity;
import com.example.entity.ImpuserEntity;
import com.example.entity.LoginEntity;
import com.example.entity.UserEntity;
import com.example.mapper.ManageMapper;
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
public class ManageService {
    @Autowired
    ManageMapper manageMapper;

    public List<UserEntity> getStudent(){
        // 获取当前用户信息
        Subject subject = SecurityUtils.getSubject();
        LoginEntity loginInfo = (LoginEntity) subject.getPrincipal();
        return  manageMapper.getStudent(String.valueOf(loginInfo.getUserid()));
    }
    public List<UserEntity> getTeacher(){
        // 获取当前用户信息
        Subject subject = SecurityUtils.getSubject();
        LoginEntity loginInfo = (LoginEntity) subject.getPrincipal();
        return  manageMapper.getTeacher(String.valueOf(loginInfo.getUserid()));
    }

    public Integer removeUser(Long userid){
        return manageMapper.removeUser(userid);
    }

    public Integer removeGrade(Integer gradeid){
        return manageMapper.removeGrade(gradeid);
    }

    public Integer addUser(UserEntity userEntity){
        return manageMapper.addUser(userEntity);
    }

    public Integer addGrade(GradeEntity gradeEntity){
        return manageMapper.addGrade(gradeEntity);
    }

    public Integer Import(List<ImpuserEntity> list){
        return manageMapper.Import(list);
    }
}
