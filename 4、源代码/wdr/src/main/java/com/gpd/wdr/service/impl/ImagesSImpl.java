package com.gpd.wdr.service.impl;

import com.gpd.wdr.dao.ImagesDAO;
import com.gpd.wdr.entity.Images;
import com.gpd.wdr.service.ImagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ImagesSImpl implements ImagesService {
    @Autowired
    private ImagesDAO imagesDAO;
    @Override
    public int add(Images record) {
        int result=imagesDAO.insert(record);
        return result;
    }

    @Override
    public int addSelective(Images record) {
        int result=imagesDAO.insertSelective(record);
        return result;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        int result=imagesDAO.deleteByPrimaryKey(id);
        return result;
    }

    @Override
    public int updateByPrimaryKey(Images record) {
        int result=imagesDAO.updateByPrimaryKey(record);
        return result;
    }

    @Override
    public int updateByPrimaryKeySelective(Images record) {
        int result=imagesDAO.updateByPrimaryKeySelective(record);
        return result;
    }

    @Override
    public Images selectByPrimaryKey(Integer id) {
        Images result=imagesDAO.selectByPrimaryKey(id);
        return null;
    }

    @Override
    public List<Images> selectAll() {
        List<Images> result=imagesDAO.selectAll();
        return result;
    }
}
