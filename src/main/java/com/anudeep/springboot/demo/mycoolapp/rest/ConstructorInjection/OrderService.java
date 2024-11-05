package com.anudeep.springboot.demo.mycoolapp.rest.ConstructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class OrderService {
    private final PaymentService paymentService;
    private final ShipmentService shipmentService;
    @Autowired
    public OrderService(PaymentService paymentService, ShipmentService shipmentService){
        this.paymentService=paymentService;
        this.shipmentService=shipmentService;
    }
    public void placeOrder(){
        paymentService.processPayment();
        shipmentService.processShipment();
        System.out.println("Placing the order");
        System.out.println(new Date());
    }
}
