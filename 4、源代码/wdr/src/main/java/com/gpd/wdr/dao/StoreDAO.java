package com.gpd.wdr.dao;

import com.gpd.wdr.entity.Store;
import org.springframework.stereotype.Repository;

/**
 * StoreDAO继承基类
 */
@Repository
public interface StoreDAO extends MyBatisBaseDao<Store, Integer> {
}