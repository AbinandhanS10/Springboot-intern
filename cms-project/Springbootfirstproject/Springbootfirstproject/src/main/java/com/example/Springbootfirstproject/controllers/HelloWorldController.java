package com.example.Springbootfirstproject.controllers;

import com.example.Springbootfirstproject.models.Employee;
import com.example.Springbootfirstproject.models.Student;
import com.example.Springbootfirstproject.serviece.HelloWorldServiece;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloWorldController
{
    @Autowired
    HelloWorldServiece  hws;

    @GetMapping("/abc")
    public String hello()
    {
        return hws.get();
        //System.out.println("hello world");
        //return "Hello From Hello World dc from rest controller";
    }

    @PostMapping("/abc")
    public String postMethod()
    {
        return hws.post();
    }

    @PutMapping("/abc")
    public String putMethod()
    {
        return hws.put();
    }

    @DeleteMapping("/abc")
    public String deleteMethod()
    {
        return hws.del();
    }

    @GetMapping("/emp")
    public ArrayList<Employee> emp(){
        return hws.getallEmp();
    }

    @PostMapping("/emp")
    public void setarray(@RequestBody Employee emp)
    {
        hws.setvalue(emp);
    }

    @DeleteMapping("/emp/{id}")
    public void deleteEmp(@PathVariable int id) {
        hws.deleteEmpById(id);
    }

    @PutMapping("/emp/{id}")
    public void updateEmp(@PathVariable int id, @RequestBody Employee updatedEmp) {
        hws.updateEmp(id, updatedEmp);
    }

    @GetMapping("/emp/{id}")
    public Employee getEmpById(@PathVariable int id) {
        return hws.getEmpById(id);
    }


        //Student

    @GetMapping("/std/{roll}")
    public Student getStudentByRoll(@PathVariable int roll) {
        return hws.getStudentByRoll(roll);
    }

    @GetMapping("/std")
    public List<Student> std()
    {
        return hws.getStudents();
    }

    @PostMapping("/std")
    public void setstudent(@RequestBody Student std)
    {
        hws.setStudents(std);
    }

    @DeleteMapping("/std/{roll}")
    public void deleteStudent(@PathVariable int roll) {
        hws.deleteStudentByRoll(roll);
    }

    @PutMapping("/std/{roll}")
    public void updateStudent(@PathVariable int roll, @RequestBody Student updatedStd) {
        hws.updateStudent(roll, updatedStd);
    }
}
