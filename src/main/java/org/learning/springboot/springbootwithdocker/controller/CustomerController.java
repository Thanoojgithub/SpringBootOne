package org.learning.springboot.springbootwithdocker.controller;

import org.learning.springboot.springbootwithdocker.model.Customer;
import org.learning.springboot.springbootwithdocker.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

@GetMapping("/")
public Iterable<Customer> findAll() throws Exception {
    return customerService.findAll();
}

}
