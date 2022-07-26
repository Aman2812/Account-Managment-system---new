package com.springres.springres.controller;

import com.springres.springres.entity.Customer;
import com.springres.springres.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManagerController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/adduser")
    private Customer addUser(@RequestBody Customer customer){
        return customerService.adduser(customer);
    }
}
