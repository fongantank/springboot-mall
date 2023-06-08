package com.tank.springbootmall.controller;

import com.tank.springbootmall.constant.ProductCategory;
import com.tank.springbootmall.dto.ProductQueryParams;
import com.tank.springbootmall.dto.ProductRequest;
import com.tank.springbootmall.model.Product;
import com.tank.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ProductController {

  @Autowired
  private ProductService productService;

  @GetMapping("/products")
  public ResponseEntity<List<Product>> getProducts(
      // 查詢條件 Filtering
      @RequestParam(required = false) ProductCategory category,
      @RequestParam(required = false) String search,

      // 排序 Sorting
      @RequestParam(defaultValue = "created_date") String orderBy,
      @RequestParam(defaultValue = "desc") String sort
  ) {
    ProductQueryParams productQueryParams = new ProductQueryParams();
    productQueryParams.setCategory(category);
    productQueryParams.setSearch(search);
    productQueryParams.setOrderBy(orderBy);
    productQueryParams.setSort(sort);

//    List<Product> productList = productService.getProducts(category, search);
    List<Product> productList = productService.getProducts(productQueryParams);

    return ResponseEntity.status(HttpStatus.OK).body(productList);
  }

  @GetMapping("/products/{productId}")
  public ResponseEntity<Product> getProduct(@PathVariable Integer productId) {
    Product product = productService.getProductById(productId);

    if(product != null) {
      return ResponseEntity.status(HttpStatus.OK).body(product);
    } else {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
  }

  @PostMapping("/products")
  public ResponseEntity<Product> createProduct(@RequestBody @Valid ProductRequest productRequest) {
    Integer productId = productService.createProduct(productRequest);

    Product product = productService.getProductById(productId);

    return ResponseEntity.status(HttpStatus.CREATED).body(product);
  }

  @PutMapping("/products/{productId}")
  public ResponseEntity<Product> updateProduct(@PathVariable Integer productId,
                                               @RequestBody ProductRequest productRequest) {

    Product product = productService.getProductById(productId);

    // 檢查 product 是否存在
    if (product == null) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }

    // 修改商品的數據
    productService.updateProduct(productId, productRequest);

    Product updatedProduct = productService.getProductById(productId);

    return ResponseEntity.status(HttpStatus.OK).body(updatedProduct);
  }

  @DeleteMapping("/products/{productId}")
  public ResponseEntity<?> deleteProduct(@PathVariable Integer productId) {
    productService.deleteProductById(productId);

    return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
  }
}
