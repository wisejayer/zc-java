package com.example.mapper;

import com.example.entity.ListEntity;

import java.util.List;

/**
 * @email: 1418084893@qq.com
 * @author: wisejay
 */
public interface ListMapper {
    List<ListEntity> getList(String userid);
}
