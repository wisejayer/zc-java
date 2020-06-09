package com.example.service;

import com.example.entity.AddEntity;
import com.example.mapper.AddMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @email: 1418084893@qq.com
 * @author: wisejay
 */
@Service
public class AddService {
    @Autowired
    AddMapper addMapper;

    public int add(AddEntity addEntity){
        return addMapper.add(addEntity);
    }
}
