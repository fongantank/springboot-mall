package com.tank.springbootmall.dao;

import com.tank.springbootmall.dto.UserRegisterRequest;
import com.tank.springbootmall.model.User;

public interface UserDao {

  User getUserById(Integer userId);

  Integer createUser(UserRegisterRequest userRegisterRequest);
}
