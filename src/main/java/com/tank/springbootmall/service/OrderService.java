package com.tank.springbootmall.service;

import com.tank.springbootmall.dto.CreateOrderRequest;
import com.tank.springbootmall.model.Order;

public interface OrderService {

  Order getOrderById(Integer orderId);

  Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
