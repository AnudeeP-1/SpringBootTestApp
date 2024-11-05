package com.anudeep.springboot.demo.mycoolapp.rest.ConstructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final OrderService orderService;
    @Autowired
    public Controller(OrderService orderService) {
        this.orderService = orderService;
    }
    @GetMapping("/placeOrder")
    public String placeOrder(){
        orderService.placeOrder();
        return "Order placed successfully";
    }
}
