package com.example.controller;

import com.example.entity.*;
import com.example.service.ManageService;
import com.example.until.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @email: 1418084893@qq.com
 * @author: wisejay
 */
@RestController
@RequestMapping("/manage")
public class ManageController {
    @Autowired
    ManageService manageService;

    @GetMapping("/student")
    public List<UserEntity> getStudent(){
        return manageService.getStudent();
    }

    @GetMapping("/teacher")
    public  List<UserEntity> getTeacher(){
        return manageService.getTeacher();
    }

    @RequestMapping(value = "/user/{userid}", method = RequestMethod.DELETE)
    public RespEntity removeUser(@PathVariable Long userid){
        if (manageService.removeUser(userid) == 1) {
            return RespEntity.success("删除成功!");
        }
        return RespEntity.falied("删除失败!");
    }

    @RequestMapping(value = "/grade/{gradeid}", method = RequestMethod.DELETE)
    public RespEntity removeGrade(@PathVariable Integer gradeid){
        if (manageService.removeGrade(gradeid) == 1) {
            return RespEntity.success("删除成功!");
        }
        return RespEntity.falied("删除失败!");
    }

    @PostMapping("/user")
    public RespEntity addUser(UserEntity userEntity){
        if(manageService.addUser(userEntity) == 1){
            return RespEntity.success("提交成功");
        }
        return RespEntity.falied("提交失败");
    }

    @PostMapping("/grade")
    public RespEntity addGrade(GradeEntity gradeEntity){
        if(manageService.addGrade(gradeEntity) == 1){
            return RespEntity.success("提交成功");
        }
        return RespEntity.falied("提交失败");
    }

    @PostMapping("/import")
    public RespEntity Import(MultipartFile file){
        List<ImpuserEntity> list = ExcelUtil.importData(file,1,ImpuserEntity.class);
        if(list!=null&&manageService.Import(list) == 1){
            return RespEntity.success("导入成功");
        }
        return RespEntity.falied("导入失败");
    }
}
