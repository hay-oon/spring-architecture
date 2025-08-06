package com.example.demo.controller.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {
    private final IDisplayProductUseCase productService;

    // http://localhost:8080/api/products = GET 상품 리스트 조회 API
    @GetMapping("")
    @ResponseBody
    public ResponseEntity<List<ProductResponseDto>> listProducts() {
        List<Product> retrieved = productService.getProducts(null); // null??
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(retrieved.stream().map(ProductResponseDto::from).toList());
    }

    // http://localhost:8080/api/products/1 = GET 상품 디테일 조회 API
    @GetMapping("/{productId}")
    @ResponseBody
    public ResponseEntity<ProductResponseDto> productDetail(@PathVariable Long productId) {
        Product retrieved = productService.getProductById(ProductId);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(ProductResponseDtp.from(retrieved));
    }
}
