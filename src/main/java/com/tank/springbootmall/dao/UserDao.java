package com.tank.springbootmall.dao;

import com.tank.springbootmall.dto.UserRegisterRequest;
import com.tank.springbootmall.model.User;

public interface UserDao {

  User getUserById(Integer userId);

  User getUserByEmail(String email);

  Integer createUser(UserRegisterRequest userRegisterRequest);
}
