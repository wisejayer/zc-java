package com.example.service;

import com.example.entity.LoginEntity;
import com.example.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @email: 1418084893@qq.com
 * @author: wisejay
 */
@Service
public class LoginService {
    @Autowired
    LoginMapper loginMapper;

    public LoginEntity login(String id) {

        return loginMapper.login(id);
    }
}
