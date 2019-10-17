package com.gpd.wdr.dao;

import com.gpd.wdr.entity.Rentprice;
import org.springframework.stereotype.Repository;

/**
 * RentpriceDAO继承基类
 * @author Administrator
 */
@Repository
public interface RentpriceDAO extends MyBatisBaseDao<Rentprice, Integer> {
}