package com.example.controller;

import com.example.entity.LoginEntity;
import com.example.entity.RespEntity;
import com.example.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @email: 1418084893@qq.com
 * @author: wisejay
 */
@RestController
public class SystemController {
    @Autowired
    SystemService systemService;

    @PostMapping("/system")
    public RespEntity updatePass(LoginEntity loginEntity){
        if (systemService.updatePass(loginEntity) == 1) {
            return RespEntity.success("修改成功!");
        }
        return RespEntity.falied("修改失败!");
    }
}
