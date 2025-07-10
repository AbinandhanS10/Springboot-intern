package com.example.Springboot_Internship.services;

import com.example.Springboot_Internship.models.RegisterDetails;
import com.example.Springboot_Internship.repository.RegisterDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private RegisterDetailsRepository registerDetailsRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public String addNewEmployee(RegisterDetails register) {
        RegisterDetails newEmployee = new RegisterDetails();

        newEmployee.setEmpId(register.getEmpId());
        newEmployee.setEmail(register.getEmail());
        newEmployee.setName(register.getName());
        newEmployee.setDob(register.getDob());
        newEmployee.setGender(register.getGender());

        String encodedPassword = passwordEncoder.encode(register.getPassword());
        System.out.println("Password is: " + encodedPassword);
        newEmployee.setPassword(encodedPassword);

        newEmployee.setRole(register.getRole());
        registerDetailsRepository.save(newEmployee);
        return "Employee Added Successfully";
    }

    public String authenticate(RegisterDetails login) {
        RegisterDetails user = registerDetailsRepository.findByEmail(login.getEmail());
        if (user != null )
            if(passwordEncoder.matches(login.getPassword(), user.getPassword())) {
                return "Login Successful";
            } else {
                return "Invalid Email or Password";
            }
        return "";
    }
}