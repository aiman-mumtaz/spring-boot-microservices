package com.aiman.spring.springboot_revisit.enterprise.example.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aiman.spring.springboot_revisit.enterprise.example.data.DataService;

@Component
public class BusinessService {
    @Autowired DataService dataService;

    public long calculateSum(){
        List<Integer> data =dataService.getData();
        return data.stream().reduce(Integer::sum).get();
    }
}
