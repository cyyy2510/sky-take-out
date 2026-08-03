package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SetmealDishMapper {
    /**
     * 查询菜品id对应的套餐id
     * @param dishIds
     * @return
     */
    List<Long> getSetmealDishIds(List<Long> dishIds );
}
