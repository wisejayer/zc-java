package com.example.service;

import com.example.entity.ListEntity;
import com.example.entity.LoginEntity;
import com.example.mapper.ListMapper;
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
public class ListService {
    @Autowired
    ListMapper listMapper;
    public List<ListEntity> getList(){
        Subject subject = SecurityUtils.getSubject();
        LoginEntity loginInfo = (LoginEntity) subject.getPrincipal();
        return listMapper.getList(String.valueOf(loginInfo.getUserid()));
    }
}
