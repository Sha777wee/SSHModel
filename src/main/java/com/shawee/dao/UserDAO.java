package com.shawee.dao;

import com.shawee.enity.UserEntity;

import java.util.List;

/**
 * Created by shawee on 2018/7/19
 */
public interface UserDAO {
    public List<UserEntity> getAll();
}
