package com.gpd.wdr.service.impl;

import com.gpd.wdr.dao.OrderformDAO;
import com.gpd.wdr.entity.Orderform;
import com.gpd.wdr.service.OrderformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author Administrator
 */
@Service
public class OrderformSImpl implements OrderformService {
    @Autowired
    private OrderformDAO orderformDAO;
    @Override
    public int add(Orderform record) {
        int result=orderformDAO.insert(record);
        return result;
    }

    @Override
    public int addSelective(Orderform record) {
        int result=orderformDAO.insertSelective(record);
        return result;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        int result=orderformDAO.deleteByPrimaryKey(id);
        return result;
    }

    @Override
    public int updateByPrimaryKey(Orderform record) {
        int result=orderformDAO.updateByPrimaryKey(record);
        return result;
    }

    @Override
    public int updateByPrimaryKeySelective(Orderform record) {
        int result=orderformDAO.updateByPrimaryKeySelective(record);
        return result;
    }

    @Override
    public Orderform selectByPrimaryKey(Integer id) {
        Orderform result=orderformDAO.selectByPrimaryKey(id);
        return null;
    }

    @Override
    public List<Orderform> selectAll() {
        List<Orderform> result=orderformDAO.selectAll();
        return result;
    }

    @Override
    public List<Orderform> selectByUserId(Integer id) {
        List<Orderform> result=orderformDAO.selectByUserId(id);
        return result;
    }
}
