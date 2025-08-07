package com.example.demo.service.usecases;

import com.example.demo.repository.entity.Cart;

import java.util.Optional;

public interface ImanageCartUseCase {
    void addProductToCart(Long customerId, Long productId, Long optionId, int quantity);
    Optional<Cart> getCart(Long customerId);
}