package com.gpd.wdr.service;

import com.gpd.wdr.entity.User;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

public interface MyBaseService<Model,PK extends Serializable>{
    int add(Model record);
    int addSelective(Model record);
    int deleteByPrimaryKey(PK id);
    int updateByPrimaryKey(Model record);
    int updateByPrimaryKeySelective(Model record);
    Model selectByPrimaryKey(PK id);
    List<Model> selectAll();

}
