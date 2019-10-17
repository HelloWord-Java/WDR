package com.gpd.wdr.dao;


import com.gpd.wdr.entity.ShoppingTrolleyKey;
import org.springframework.stereotype.Repository;

/**
 * ShoppingTrolleyDAO继承基类
 */
@Repository
public interface ShoppingTrolleyDAO extends MyBatisBaseDao<ShoppingTrolleyKey, ShoppingTrolleyKey> {
}