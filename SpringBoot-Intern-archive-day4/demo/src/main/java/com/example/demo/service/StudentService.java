//package com.example.demo.service;
//
//import com.example.demo.models.Student;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//@Service
//public class StudentService {
//
//    // Initialize the student list
//    List<Student> studentList = new ArrayList<>(
//            Arrays.asList(
//                    new Student(1, "Prasanth", "Physics"),
//                    new Student(2, "Yuvaraj", "Mathematics")
//            )
//    );
//
//    // POST method
//    public String postMethod() {
//        return "Post method called successfully";
//    }
//
//    // GET method
//    public String getWelcomeMessage() {
//        return "Get method called successfully";
//    }
//
//    // PUT method
//    public String putMethod() {
//        return "Put method called";
//    }
//
//    // DELETE method
//    public String deleteMethod() {
//        return "Delete method called";
//    }
//
//    // Get all students
//    public List<Student> getAllStudents() {
//        return studentList;
//    }
//
//    // Add a new student
//    public void addStudent(Student student) {
//        studentList.add(student);
//    }
//}


package com.example.demo.service;

import com.example.demo.models.Student;
import com.example.demo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public String postMethod() {
        return "Post method called successfully";
    }

    public String getWelcomeMessage() {
        return "Get method called successfully";
    }

    public String putMethod() {
        return "Put method called";
    }

    public String deleteMethod() {
        return "Delete method called";
    }

    // Get all students
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    // Add a new student
    public void addStudent(Student student) {
        studentRepo.save(student);
    }
}

