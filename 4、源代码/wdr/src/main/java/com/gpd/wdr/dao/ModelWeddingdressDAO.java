package com.gpd.wdr.dao;

import com.gpd.wdr.entity.ModelWeddingdressKey;
import org.springframework.stereotype.Repository;

import java.security.Key;

/**
 * ModelWeddingdressDAO继承基类
 */
@Repository
public interface ModelWeddingdressDAO extends MyBatisBaseDao<ModelWeddingdressKey,ModelWeddingdressKey> {
}