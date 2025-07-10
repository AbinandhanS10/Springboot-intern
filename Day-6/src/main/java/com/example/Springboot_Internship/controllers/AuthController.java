package com.example.Springboot_Internship.controllers;

import com.example.Springboot_Internship.models.RegisterDetails;
import com.example.Springboot_Internship.services.AuthService;
import com.example.Springboot_Internship.repository.RegisterDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class AuthController {

    @Autowired
    private AuthService authService;

    @Autowired
    private RegisterDetailsRepository registerDetailsRepository;

    // Register a new employee
    @PostMapping("/register")
    public String addNewEmployee(@RequestBody RegisterDetails register) {
        return authService.addNewEmployee(register); // use object, not class name
    }

    // Login
    @PostMapping("/login")
    public String login(@RequestBody RegisterDetails login) {
        RegisterDetails user = registerDetailsRepository.findByEmail(login.getEmail());

        if (user != null && user.getPassword().equals(login.getPassword())) {
            return "Employee Logged in Successfully";
        } else {
            return "Invalid Email or Password";
        }
    }
}