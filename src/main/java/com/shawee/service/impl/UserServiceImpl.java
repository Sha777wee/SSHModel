package com.shawee.service.impl;

import com.shawee.dao.UserDAO;
import com.shawee.enity.UserEntity;
import com.shawee.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * Created by shawee on 2018/7/19
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Override
    public List<UserEntity> getAll(){
        return userDAO.getAll();
    }
}
