package com.anudeep.springboot.demo.mycoolapp.rest.ConstructorInjection;

import org.springframework.stereotype.Service;

@Service
public class ShipmentService{
    public void processShipment(){
        System.out.println("Procesing shipment");
    }
}
