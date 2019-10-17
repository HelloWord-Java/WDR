package com.gpd.wdr.dao;

import com.gpd.wdr.entity.Images;
import org.springframework.stereotype.Repository;

/**
 * ImagesDAO继承基类
 */
@Repository
public interface ImagesDAO extends MyBatisBaseDao<Images, Integer> {
}