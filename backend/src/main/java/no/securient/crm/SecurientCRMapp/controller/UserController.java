package no.securient.crm.SecurientCRMapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @GetMapping("/list")
    public String list() {
        return "List users";
    }

    @GetMapping("/list/{id}")
    public String list(@PathVariable int id) {
        return "List user with id: " + id;
    }

    @PostMapping("/add")
    public String add() {
        return "Add user";
    }

    @PutMapping("/update")
    public String update() {
        return "Update user";
    }
}
