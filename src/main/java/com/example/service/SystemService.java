package com.example.service;

import com.example.entity.LoginEntity;
import com.example.mapper.SystemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @email: 1418084893@qq.com
 * @author: wisejay
 */
@Service
public class SystemService {
    @Autowired
    SystemMapper systemMapper;

    public Integer updatePass(LoginEntity loginEntity){
        return systemMapper.updatePass(loginEntity);
    }
}
