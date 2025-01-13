package no.securient.crm.SecurientCRMapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/company")
public class CompanyController {
    public CompanyController() {}

    @GetMapping("/list")
    public String list() {
        return "list";
    }

    @PostMapping("/add")
    public String add() {
        return null;
    }

    @PutMapping("/update")
    public String update() {
        return null;
    }
}
