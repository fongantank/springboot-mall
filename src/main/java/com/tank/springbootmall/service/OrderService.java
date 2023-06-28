package com.tank.springbootmall.service;

import com.tank.springbootmall.dto.CreateOrderRequest;
import com.tank.springbootmall.dto.OrderQueryParams;
import com.tank.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

  Integer countOrder(OrderQueryParams orderQueryParams);

  List<Order> getOrders(OrderQueryParams orderQueryParams);

  Order getOrderById(Integer orderId);

  Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
