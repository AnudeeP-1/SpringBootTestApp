package com.anudeep.springboot.demo.mycoolapp.rest.ConstructorInjection;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public void processPayment(){
        System.out.println("Processing Payment");
    }
}

