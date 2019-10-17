package com.gpd.wdr.service;

import com.gpd.wdr.entity.ModelWeddingdressKey;

/**
 * @author Administrator
 */
public interface ModelWeddingdressService{
    int deleteByPrimaryKey(ModelWeddingdressKey modelWeddingdressKey);
    int add(ModelWeddingdressKey modelWeddingdressKey);
    int addSelective(ModelWeddingdressKey modelWeddingdressKey);
}
