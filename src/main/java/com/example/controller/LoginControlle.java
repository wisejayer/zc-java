package com.example.controller;

import com.example.entity.RespEntity;
import com.example.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @email: 1418084893@qq.com
 * @author: wisejay
 */
@RestController
public class LoginControlle {
    @Autowired
    UserService userService;

    @PostMapping("/login")
    public RespEntity login(String userid,
                            String password){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(userid,password); //创建token
        try {
            subject.login(token);//登陆成功保存token
            return RespEntity.success("登陆成功",userService.getUser());
        }catch (UnknownAccountException e){
            return RespEntity.falied("用户不存在");
        }catch (IncorrectCredentialsException e){
            return RespEntity.falied("密码错误");
        }

    }
}
