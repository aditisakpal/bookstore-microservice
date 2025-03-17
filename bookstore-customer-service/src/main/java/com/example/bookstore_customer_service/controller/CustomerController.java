package com.example.bookstore_customer_service.controller;

import com.example.bookstore_customer_service.model.Customer;
import com.example.bookstore_customer_service.repository.CustomerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @PostMapping("/register")
    public Customer registerCustomer(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }
}