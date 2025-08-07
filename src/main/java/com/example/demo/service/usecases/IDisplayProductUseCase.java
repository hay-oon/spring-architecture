package com.example.demo.service.usecases;

import com.example.demo.repository.entity.Product;

import java.util.List;

public interface IDisplayProductUseCase {
    List<Product> getProducts(String keyword);
    Product getProductById(Long productId);
}
