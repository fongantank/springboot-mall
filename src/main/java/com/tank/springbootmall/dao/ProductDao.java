package com.tank.springbootmall.dao;

import com.tank.springbootmall.constant.ProductCategory;
import com.tank.springbootmall.dto.ProductQueryParams;
import com.tank.springbootmall.dto.ProductRequest;
import com.tank.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

  Integer countProduct(ProductQueryParams productQueryParams);

//  List<Product> getProducts(ProductCategory category, String search);
  List<Product> getProducts(ProductQueryParams productQueryParams);

  Product getProductById(Integer productId);

  Integer createProduct(ProductRequest productRequest);

  void updateProduct(Integer productId, ProductRequest productRequest);

  void deleteProductById(Integer productId);
}
