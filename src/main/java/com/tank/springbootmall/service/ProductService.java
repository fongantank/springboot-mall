package com.tank.springbootmall.service;

import com.tank.springbootmall.dto.ProductRequest;
import com.tank.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

  List<Product> getProducts();

  Product getProductById(Integer productId);

  Integer createProduct(ProductRequest productRequest);

  void updateProduct(Integer productId, ProductRequest productRequest);

  void deleteProductById(Integer productId);
}
