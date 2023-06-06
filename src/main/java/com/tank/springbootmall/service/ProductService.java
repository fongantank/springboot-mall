package com.tank.springbootmall.service;

import com.tank.springbootmall.dto.ProductRequest;
import com.tank.springbootmall.model.Product;

public interface ProductService {

  Product getProductById(Integer productId);

  Integer createProduct(ProductRequest productRequest);
}
