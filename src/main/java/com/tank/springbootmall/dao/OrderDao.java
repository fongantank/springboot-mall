package com.tank.springbootmall.dao;

import com.tank.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {

  Integer createOrder(Integer userId, Integer totalAmount);

  void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}
