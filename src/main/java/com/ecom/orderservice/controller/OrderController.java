package com.ecom.orderservice.controller;


import com.ecom.orderservice.dto.OrderRequest;
import com.ecom.orderservice.entity.Order;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    public String placeOrder(@RequestBody OrderRequest orderRequest)
    {
        return "order placed successfully";
    }
}
