package com.example.mapper;

import com.example.entity.CountEntity;
import com.example.entity.FormEntity;
import com.example.entity.GradeEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @email: 1418084893@qq.com
 * @author: wisejay
 */
public interface MonitorMapper {
    int update(@Param("form") FormEntity FormEntity);

    int pass(Integer no);

    int delete(Integer no);

    List<GradeEntity> getGrade(String userid);

    List<CountEntity> getMark(Integer gradeid);
}
