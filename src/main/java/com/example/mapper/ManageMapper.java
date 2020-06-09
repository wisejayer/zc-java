package com.example.mapper;

import com.example.entity.GradeEntity;
import com.example.entity.ImpuserEntity;
import com.example.entity.UserEntity;

import java.util.List;

/**
 * @email: 1418084893@qq.com
 * @author: wisejay
 */
public interface ManageMapper {
    List<UserEntity> getStudent(String userid);

    List<UserEntity> getTeacher(String userid);

    Integer removeUser(Long userid);

    Integer removeGrade(Integer gradeid);

    Integer addUser(UserEntity userEntity);

    Integer addGrade(GradeEntity gradeEntity);

    Integer Import(List<ImpuserEntity> list);
}
