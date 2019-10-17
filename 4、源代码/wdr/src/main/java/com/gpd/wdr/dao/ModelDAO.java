package com.gpd.wdr.dao;

import com.gpd.wdr.entity.Model;
import org.springframework.stereotype.Repository;

/**
 * ModelDAO继承基类
 */
@Repository
public interface ModelDAO extends MyBatisBaseDao<Model, Integer> {
}