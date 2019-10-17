package com.gpd.wdr.service.impl;

import com.gpd.wdr.dao.RentpriceDAO;
import com.gpd.wdr.entity.Rentprice;
import com.gpd.wdr.service.RentpriceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentpriceSImpl implements RentpriceService {
    private RentpriceDAO rentpriceDAO;
    @Override
    public int add(Rentprice record) {
        int result=rentpriceDAO.insert(record);
        return result;
    }

    @Override
    public int addSelective(Rentprice record) {
        int result=rentpriceDAO.insertSelective(record);
        return result;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        int result=rentpriceDAO.deleteByPrimaryKey(id);
        return result;
    }

    @Override
    public int updateByPrimaryKey(Rentprice record) {
        int result=rentpriceDAO.updateByPrimaryKey(record);
        return result;
    }

    @Override
    public int updateByPrimaryKeySelective(Rentprice record) {
        int result=rentpriceDAO.updateByPrimaryKeySelective(record);
        return result;
    }

    @Override
    public Rentprice selectByPrimaryKey(Integer id) {
        Rentprice result=rentpriceDAO.selectByPrimaryKey(id);
        return result;
    }

    @Override
    public List<Rentprice> selectAll() {
        List<Rentprice> result=rentpriceDAO.selectAll();
        return result;
    }
}
