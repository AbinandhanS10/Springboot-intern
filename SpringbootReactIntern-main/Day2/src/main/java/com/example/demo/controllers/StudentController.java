package com.example.demo.controllers;

import com.example.demo.models.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student") // ✅ All routes now start with /student
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/post")
    public String postMethod() {
        return studentService.postMethod();
    }

    @GetMapping("/hello")
    public String hello() {
        System.out.println("Hello student world");
        return studentService.getWelcomeMessage();
    }

    @PutMapping("/put")
    public String putMethod() {
        return studentService.putMethod();
    }

    @DeleteMapping("/delete")
    public String deleteMethod() {
        return studentService.deleteMethod();
    }

    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
        return "Student added successfully";
    }
}
