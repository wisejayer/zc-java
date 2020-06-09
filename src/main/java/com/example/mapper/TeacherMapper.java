package com.example.mapper;

import com.example.entity.UserEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @email: 1418084893@qq.com
 * @author: wisejay
 */
public interface TeacherMapper {
    List<UserEntity> getMonitor(String userid);

    Integer add(@Param("form")UserEntity userEntity);

    Integer delete(String userid);
}
