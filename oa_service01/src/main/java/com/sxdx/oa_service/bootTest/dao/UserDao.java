package com.sxdx.oa_service.bootTest.dao;

import com.sxdx.oa_service.bootTest.bean.User;

import java.util.List;

/**
 * @author 高一鹏
 * @create 2018-10-27 17:50
 */
public interface UserDao {
    public User getUserById(Integer id);

    public List<User> getUserList();

    public int add(User user);

    public int update(Integer id, User user);

    public int delete(Integer id);

}
