package no.securient.crm.SecurientCRMapp.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
    public CustomerController() {

    }

    @GetMapping("/list")
    public String listCustomers() {
        return "Customer List";
    }

    @PostMapping("/add")
    public String addCustomer() {
        return "Customer Added";
    }
}
