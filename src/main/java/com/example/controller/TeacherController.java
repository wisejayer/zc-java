package com.example.controller;

import com.example.entity.RespEntity;
import com.example.entity.UserEntity;
import com.example.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @email: 1418084893@qq.com
 * @author: wisejay
 */
@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    TeacherService teacherService;

    @GetMapping("/monitor")
    public List<UserEntity> getMonitor(){
        return teacherService.getMonitor();
    }

    @PostMapping("/add")
    public RespEntity add(UserEntity userEntity){
        if( teacherService.add(userEntity)==1){
            return RespEntity.success("添加成功");
        }
        return RespEntity.falied("添加失败");
    }

    @GetMapping("/delete/{userid}")
    public  RespEntity delete(@PathVariable String userid){
        if( teacherService.delete(userid)==1){
            return RespEntity.success("删除成功");
        }
        return RespEntity.falied("删除失败");
    }
}
