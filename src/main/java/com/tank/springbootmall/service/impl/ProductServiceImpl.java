package com.tank.springbootmall.service.impl;

import com.tank.springbootmall.constant.ProductCategory;
import com.tank.springbootmall.dao.ProductDao;
import com.tank.springbootmall.dto.ProductQueryParams;
import com.tank.springbootmall.dto.ProductRequest;
import com.tank.springbootmall.model.Product;
import com.tank.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {

  @Autowired
  private ProductDao productDao;

  @Override
  public Integer countProduct(ProductQueryParams productQueryParams) {
    return productDao.countProduct(productQueryParams);
  }

  @Override
//  public List<Product> getProducts(ProductCategory category, String search) {
//    return productDao.getProducts(category, search);
//  }
  public List<Product> getProducts(ProductQueryParams productQueryParams) {
    return productDao.getProducts(productQueryParams);
  }

  @Override
  public Product getProductById(Integer productId) {
    return productDao.getProductById(productId);
  }

  @Override
  public Integer createProduct(ProductRequest productRequest) {
    return productDao.createProduct(productRequest);
  }

  @Override
  public void updateProduct(Integer productId, ProductRequest productRequest) {
    productDao.updateProduct(productId, productRequest);
  }

  @Override
  public void deleteProductById(Integer productId) {
    productDao.deleteProductById(productId);
  }
}
