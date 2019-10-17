package com.gpd.wdr.service.impl;

import com.gpd.wdr.dao.UserDAO;
import com.gpd.wdr.entity.User;
import com.gpd.wdr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;
    @Override
    public int add(User record) {
        int result=userDAO.insert(record);
        return result;
    }

    @Override
    public int addSelective(User record) {
        int result=userDAO.insertSelective(record);
        return result;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        int result=userDAO.deleteByPrimaryKey(id);
        return result;
    }

    @Override
    public int updateByPrimaryKey(User record) {
        int result=userDAO.updateByPrimaryKey(record);
        return result;
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        int result=userDAO.updateByPrimaryKeySelective(record);
        return result;
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        User result=userDAO.selectByPrimaryKey(id);
        return result;
    }

    @Override
    public List<User> selectAll() {
        List<User> result=userDAO.selectAll();
        return result;
    }
}
