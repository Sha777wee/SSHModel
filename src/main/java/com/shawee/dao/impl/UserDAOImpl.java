package com.shawee.dao.impl;

import com.shawee.dao.UserDAO;

import com.shawee.enity.UserEntity;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by shawee on 2018/7/19
 */
@Repository
public class UserDAOImpl implements UserDAO {

    @Resource
    private SessionFactory sessionFactory;

    @Override
    public List<UserEntity> getAll(){
        return sessionFactory.getCurrentSession().createQuery("FROM UserEntity").list();
    }
}
