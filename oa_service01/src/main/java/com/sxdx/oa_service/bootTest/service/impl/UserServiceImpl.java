package com.sxdx.oa_service.bootTest.service.impl;

import com.sxdx.oa_service.bootTest.bean.User;
import com.sxdx.oa_service.bootTest.dao.UserDao;
import com.sxdx.oa_service.bootTest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 高一鹏
 * @create 2018-10-27 17:55
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer id) {
        return userDao.getUserById(id);
    }

    @Override
    public List<User> getUserList() {
        return userDao.getUserList();
    }

    @Override
    public int add(User user) {
        return userDao.add(user);
    }

    @Override
    public int update(Integer id, User user) {
        return userDao.update(id, user);
    }

    @Override
    public int delete(Integer id) {
        return userDao.delete(id);
    }

}
