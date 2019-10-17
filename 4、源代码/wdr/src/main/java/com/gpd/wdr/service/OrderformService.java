package com.gpd.wdr.service;

import com.gpd.wdr.entity.Orderform;

import java.util.List;

/**
 * @author Administrator
 */
public interface OrderformService extends MyBaseService<Orderform,Integer> {
    List<Orderform> selectByUserId(Integer id);
}
