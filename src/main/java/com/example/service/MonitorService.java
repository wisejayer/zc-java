package com.example.service;

import com.example.entity.*;
import com.example.mapper.MonitorMapper;
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
public class MonitorService {
    @Autowired
    MonitorMapper monitorMapper;
    public int update(FormEntity formEntity){       //更新
        return monitorMapper.update(formEntity);
    }

    public int pass(Integer no){            //通过
        return monitorMapper.pass(no);
    }

    public int delete(Integer no){          //删除
        return monitorMapper.delete(no);
    }

    public List<GradeEntity> getGrade(){
       // 获取当前用户信息
       Subject subject = SecurityUtils.getSubject();
       LoginEntity loginInfo = (LoginEntity) subject.getPrincipal();
       //根据情况返回班级信息
       return monitorMapper.getGrade(String.valueOf(loginInfo.getUserid()));
    }

    public List<CountEntity> getMark(Integer gradeid){
        return monitorMapper.getMark(gradeid);
    }
}
