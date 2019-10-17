package com.gpd.wdr.service.impl;

import com.gpd.wdr.dao.ModelWeddingdressDAO;
import com.gpd.wdr.entity.ModelWeddingdressKey;
import com.gpd.wdr.service.ModelWeddingdressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 */
@Service
public class ModelWeddingdressSImpl implements ModelWeddingdressService {
    @Autowired
    private ModelWeddingdressDAO modelWeddingdressDAO;
    @Override
    public int deleteByPrimaryKey(ModelWeddingdressKey modelWeddingdressKey) {
        int result=modelWeddingdressDAO.deleteByPrimaryKey(modelWeddingdressKey);
        return result;
    }

    @Override
    public int add(ModelWeddingdressKey modelWeddingdressKey) {
        int result=modelWeddingdressDAO.insert(modelWeddingdressKey);
        return result;
    }

    @Override
    public int addSelective(ModelWeddingdressKey modelWeddingdressKey) {
        int result=modelWeddingdressDAO.insertSelective(modelWeddingdressKey);
        return result;
    }
}
