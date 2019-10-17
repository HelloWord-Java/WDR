package com.gpd.wdr.dao;

import com.gpd.wdr.entity.Weddingdress;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * WeddingdressDAO继承基类
 */
@Repository
public interface WeddingdressDAO extends MyBatisBaseDao<Weddingdress, Integer> {
    List<Weddingdress> selectByNum();
    List<Weddingdress> selectByModel(Integer id);
}