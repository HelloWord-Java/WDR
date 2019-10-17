package com.gpd.wdr.service;

import com.gpd.wdr.entity.Weddingdress;

import java.util.List;

public interface WeddingdressService extends MyBaseService<Weddingdress,Integer> {
    List<Weddingdress> selectByNum();
    List<Weddingdress> selectByModel(Integer id);
}
