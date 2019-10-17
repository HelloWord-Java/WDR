package com.gpd.wdr.service;

import com.gpd.wdr.entity.ShoppingTrolleyKey;

/**
 * @author Administrator
 */
public interface ShoppingTrolleyService{
    int deleteByPrimaryKey(ShoppingTrolleyKey shoppingTrolleyKey);
    int add(ShoppingTrolleyKey shoppingTrolleyKey);
    int addSelective(ShoppingTrolleyKey shoppingTrolleyKey);
}
