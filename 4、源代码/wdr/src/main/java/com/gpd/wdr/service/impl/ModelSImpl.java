package com.gpd.wdr.service.impl;

import com.gpd.wdr.dao.ModelDAO;
import com.gpd.wdr.entity.Model;
import com.gpd.wdr.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ModelSImpl implements ModelService {
    @Autowired
    private ModelDAO modelDAO;
    @Override
    public int add(Model record) {
        int result=modelDAO.insert(record);
        return result;
    }

    @Override
    public int addSelective(Model record) {
        int result=modelDAO.insertSelective(record);
        return result;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        int result=modelDAO.deleteByPrimaryKey(id);
        return result;
    }

    @Override
    public int updateByPrimaryKey(Model record) {
        int result=modelDAO.updateByPrimaryKey(record);
        return result;
    }

    @Override
    public int updateByPrimaryKeySelective(Model record) {
        int result=modelDAO.updateByPrimaryKeySelective(record);
        return result;
    }

    @Override
    public Model selectByPrimaryKey(Integer id) {
        Model result=modelDAO.selectByPrimaryKey(id);
        return null;
    }

    @Override
    public List<Model> selectAll() {
        List<Model> result=modelDAO.selectAll();
        return result;
    }
}
