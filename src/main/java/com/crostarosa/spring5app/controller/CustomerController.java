package com.crostarosa.spring5app.controller;

import com.crostarosa.spring5app.repositories.CustomerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

    private CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @RequestMapping("/customers")
    public String getCustomers(Model model){
        model.addAttribute("customers", customerRepository.findAll());

        return "customers";
    }
}
