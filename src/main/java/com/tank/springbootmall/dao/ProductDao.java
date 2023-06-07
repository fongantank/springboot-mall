package com.tank.springbootmall.dao;

import com.tank.springbootmall.dto.ProductRequest;
import com.tank.springbootmall.model.Product;

public interface ProductDao {

  Product getProductById(Integer productId);

  Integer createProduct(ProductRequest productRequest);

  void updateProduct(Integer productId, ProductRequest productRequest);

  void deleteProductById(Integer productId);
}
