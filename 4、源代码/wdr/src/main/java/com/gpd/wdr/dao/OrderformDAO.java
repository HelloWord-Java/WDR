package com.gpd.wdr.dao;

import com.gpd.wdr.entity.Orderform;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * OrderformDAO继承基类
 */
@Repository
public interface OrderformDAO extends MyBatisBaseDao<Orderform, Integer> {
    List<Orderform> selectByUserId(Integer id);
}