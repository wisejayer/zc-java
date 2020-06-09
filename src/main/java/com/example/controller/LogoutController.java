package com.example.controller;

import com.example.entity.RespEntity;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @email: 1418084893@qq.com
 * @author: wisejay
 */
@RestController
public class LogoutController {
    @GetMapping("/logout")
    public RespEntity logout(){
        Subject subject = SecurityUtils.getSubject();
        subject.logout();   //注销删除令牌
        return RespEntity.success("注销成功");
    }
}
