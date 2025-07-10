package com.example.Springboot_Internship.controllers;

import com.example.Springboot_Internship.models.Employee;
import com.example.Springboot_Internship.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class HelloWorldController {
    //Service layer
    @Autowired
    private HelloWorldService hws;

@PreAuthorize("hasRole('ADMIN','USER')")
    @PostMapping
    public String addEmployee(@RequestBody Employee e){
        return String.valueOf(hws.addEmployee(e.getName(), e.getRole()));
    }

    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    @GetMapping
    public List<Employee> getEmployees(){
        return hws.getAllEmployees();
    }

    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    @GetMapping("/{eid}")
    public Employee getEmployeeById(@PathVariable int eid){
        return hws.getEmployeeById(eid);
    }

    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    @GetMapping("/job/{job}")
    public Employee getEmployeeByJob(@PathVariable String job){
        return hws.getEmployeeByJob(job);
    }

    @PreAuthorize("hasRole('ADMIN','USER')")
    @DeleteMapping("/{eid}")
    public String deleteEmployee(@PathVariable int eid){
        return hws.deleteEmployeeById(eid);
    }

    @PreAuthorize("hasRole('ADMIN','USER')")
    @DeleteMapping
    public String deleteAllEmployee(){
        return hws.deleteAllEmployee();
    }

    @PreAuthorize("hasRole('ADMIN','USER')")
    @PutMapping("/{eid}")
    public String updateRecord(@RequestBody Employee employee){
        return hws.updateRecord(employee);
    }


}
