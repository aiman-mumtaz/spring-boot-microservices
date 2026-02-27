package com.aiman.spring.springboot_revisit.enterprise.example.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aiman.spring.springboot_revisit.enterprise.example.business.BusinessService;

@Component
public class MyController {
    @Autowired
    BusinessService businessService;

    MyController(BusinessService businessService){
        this.businessService = businessService;
    }
    public long returnValueFromService(){
        return businessService.calculateSum();
    }
}
