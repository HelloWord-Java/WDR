package com.gpd.wdr.service.impl;

import com.gpd.wdr.dao.WeddingdressDAO;
import com.gpd.wdr.entity.Weddingdress;
import com.gpd.wdr.service.WeddingdressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 */
@Service
public class WeddingdressSImpl implements WeddingdressService {
    @Autowired
    private WeddingdressDAO weddingdressDAO;
    @Override
    public int add(Weddingdress record) {
        int result=weddingdressDAO.insert(record);
        return result;
    }

    @Override
    public int addSelective(Weddingdress record) {
       int result=weddingdressDAO.insertSelective(record);
       return result;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        int result=weddingdressDAO.deleteByPrimaryKey(id);
        return result;
    }

    @Override
    public int updateByPrimaryKey(Weddingdress record) {
        int result=weddingdressDAO.updateByPrimaryKey(record);
        return result;
    }

    @Override
    public int updateByPrimaryKeySelective(Weddingdress record) {
        int result=weddingdressDAO.updateByPrimaryKeySelective(record);
        return result;
    }

    @Override
    public Weddingdress selectByPrimaryKey(Integer id) {
        Weddingdress result=weddingdressDAO.selectByPrimaryKey(id);
        return null;
    }

    @Override
    public List<Weddingdress> selectAll() {
        List<Weddingdress> result=weddingdressDAO.selectAll();
        return result;
    }

    @Override
    public List<Weddingdress> selectByNum() {
        List<Weddingdress> result= weddingdressDAO.selectByNum();
        return result;
    }
    @Override
    public List<Weddingdress> selectByModel(Integer id) {
        List<Weddingdress> result= weddingdressDAO.selectByModel(id);
        return result;
    }
}
