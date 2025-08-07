package com.example.demo.service.usecases;

import com.example.demo.repository.entity.Coupon;
import com.example.demo.repository.entity.vo.PaymentMethod;
import com.example.demo.repository.entity.vo.ShippingInfo;
import org.springframework.core.annotation.Order;

import java.util.List;

public interface IPurchaseOrderUseCase {
    Order process(Long customerId, ShippingInfo shippingInfo, PaymentMethod paymentMethod, Coupon coupon);
    List<Order> getOrders(Long customerId);
    Order getOrderById(Long orderId);
}
