package com.example.CrudOperations.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.CrudOperations.Models.StudentModel;
import com.example.CrudOperations.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Student")
public class StudentController {
    //Service Layer
    @Autowired
    StudentService ss;

    @PostMapping("/")
    @PostMapping
    public String addStudent(@RequestBody StudentModel s){
        ss.addStudent(s);
        return "Student Added Successfully";
    }
    @GetMapping("/")


    @GetMapping
    public List<StudentModel> getStudents(){
        return ss.getAllStudents();
    }

    @GetMapping("/{id}")
    public StudentModel getStudentById(@PathVariable int id){
        return ss.getStudentById(id);
    }

    @PutMapping("/{id}")
    public String updateStudent(@RequestBody StudentModel s){
        return ss.updateStudent(s);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id){
        return ss.deleteStudentById(id);
    }

}