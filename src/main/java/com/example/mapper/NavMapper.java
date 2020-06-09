package com.example.mapper;

import com.example.entity.NavEntity;
import java.util.List;
/**
 * @email: 1418084893@qq.com
 * @author: wisejay
 */

public interface NavMapper {
    List<NavEntity> getNav(String userid);
}
