package com.example.mapper;

import com.example.entity.HistoryEntity;

import java.util.List;

/**
 * @email: 1418084893@qq.com
 * @author: wisejay
 */
public interface HistoryMapper {
    List<HistoryEntity> getHistory(String userid);
}
