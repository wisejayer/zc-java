package com.example.service;

import com.example.entity.HistoryEntity;
import com.example.entity.LoginEntity;
import com.example.mapper.HistoryMapper;
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
public class HistoryService {
    @Autowired
    HistoryMapper historyMapper;

    public List<HistoryEntity> getHistory(){
        // 获取当前用户信息
        Subject subject = SecurityUtils.getSubject();
        LoginEntity loginInfo = (LoginEntity) subject.getPrincipal();
        return  historyMapper.getHistory(String.valueOf(loginInfo.getUserid()));
    }
}
