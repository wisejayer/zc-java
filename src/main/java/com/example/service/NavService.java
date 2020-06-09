package com.example.service;

import com.example.entity.LoginEntity;
import com.example.entity.NavEntity;
import com.example.mapper.NavMapper;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @email: 1418084893@qq.com
 * @author: wisejay
 */
import java.util.List;

@Service
public class NavService {
    @Autowired
    NavMapper navMapper;

    public List<NavEntity> getNav(){
        // 获取当前用户权限
        Subject subject = SecurityUtils.getSubject();
        LoginEntity loginInfo = (LoginEntity) subject.getPrincipal();
        //根据权限返回菜单
        return navMapper.getNav(String.valueOf(loginInfo.getUserid()));
    }
}
