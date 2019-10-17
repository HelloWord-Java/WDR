package com.gpd.wdr.service.impl;

import com.gpd.wdr.dao.StoreDAO;
import com.gpd.wdr.dao.UserDAO;
import com.gpd.wdr.entity.Store;
import com.gpd.wdr.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StoreSImpl implements StoreService {
    @Autowired
    private StoreDAO storeDAO;
    @Override
    public int add(Store record) {
        int result=storeDAO.insert(record);
        return result;
    }

    @Override
    public int addSelective(Store record) {
        int result=storeDAO.insertSelective(record);
        return result;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        int result=storeDAO.deleteByPrimaryKey(id);
        return result;
    }

    @Override
    public int updateByPrimaryKey(Store record) {
        int result=storeDAO.updateByPrimaryKey(record);
        return result;
    }

    @Override
    public int updateByPrimaryKeySelective(Store record) {
        int result=storeDAO.updateByPrimaryKeySelective(record);
        return result;
    }

    @Override
    public Store selectByPrimaryKey(Integer id) {
        Store result=storeDAO.selectByPrimaryKey(id);
        return result;
    }

    @Override
    public List<Store> selectAll() {
        List<Store> result=storeDAO.selectAll();
        return result;
    }
}
