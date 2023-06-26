package com.tank.springbootmall.service;

import com.tank.springbootmall.dto.CreateOrderRequest;

public interface OrderService {

  Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
