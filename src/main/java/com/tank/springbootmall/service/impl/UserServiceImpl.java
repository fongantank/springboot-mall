package com.tank.springbootmall.service.impl;

import com.tank.springbootmall.dao.UserDao;
import com.tank.springbootmall.dto.UserRegisterRequest;
import com.tank.springbootmall.model.User;
import com.tank.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

  @Autowired
  private UserDao userDao;

  @Override
  public User getUserById(Integer userId) {
    return userDao.getUserById(userId);
  }

  @Override
  public Integer register(UserRegisterRequest userRegisterRequest) {
    return userDao.createUser(userRegisterRequest);
  }
}
