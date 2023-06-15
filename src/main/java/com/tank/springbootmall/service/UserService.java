package com.tank.springbootmall.service;

import com.tank.springbootmall.dto.UserRegisterRequest;
import com.tank.springbootmall.model.User;

public interface UserService {

  User getUserById(Integer userId);

  Integer register(UserRegisterRequest userRegisterRequest);
}
