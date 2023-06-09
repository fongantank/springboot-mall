package com.tank.springbootmall.dao;

import com.tank.springbootmall.dto.OrderQueryParams;
import com.tank.springbootmall.model.Order;
import com.tank.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {

  Integer countOrder(OrderQueryParams orderQueryParams);

  List<Order> getOrders(OrderQueryParams orderQueryParams);

  Order getOrderById(Integer orderId);

  List<OrderItem> getOrderItemsById(Integer orderId);

  Integer createOrder(Integer userId, Integer totalAmount);

  void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}
