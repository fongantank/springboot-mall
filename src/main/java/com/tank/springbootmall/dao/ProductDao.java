package com.tank.springbootmall.dao;

import com.tank.springbootmall.model.Product;

public interface ProductDao {
  Product getProductById(Integer productId);
}
