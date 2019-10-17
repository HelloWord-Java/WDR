package com.gpd.wdr.dao;

import com.gpd.wdr.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * UserDAO继承基类
 */
@Repository
public interface UserDAO extends MyBatisBaseDao<User, Integer> {
}