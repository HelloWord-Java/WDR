package com.gpd.wdr.service.impl;

import com.gpd.wdr.dao.ShoppingTrolleyDAO;
import com.gpd.wdr.entity.ShoppingTrolleyKey;
import com.gpd.wdr.service.ShoppingTrolleyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingTrolleySImpl implements ShoppingTrolleyService {
    @Autowired
    private ShoppingTrolleyDAO shoppingTrolleyDAO;
    @Override
    public int deleteByPrimaryKey(ShoppingTrolleyKey shoppingTrolleyKey) {
        int result=shoppingTrolleyDAO.deleteByPrimaryKey(shoppingTrolleyKey);
        return result;
    }

    @Override
    public int add(ShoppingTrolleyKey shoppingTrolleyKey) {
        int result=shoppingTrolleyDAO.insert(shoppingTrolleyKey);
        return result;
    }

    @Override
    public int addSelective(ShoppingTrolleyKey shoppingTrolleyKey) {
        int result=shoppingTrolleyDAO.insertSelective(shoppingTrolleyKey);
        return result;
    }
}
