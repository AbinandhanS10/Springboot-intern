//package com.example.demo.service;
//
//import org.springframework.stereotype.Service;
//
//@Service
//public class MyService {
//    public String getWelcomeMessage() {
//        return "Hello folks, welcome (from service)";
//    }
//    public String postMethod(){
//        return "This is a post method";
//    }
//    public String putMethod(){
//        return "This is a put method";
//    }
//    public String deleteMethod(){
//        return "This is a delete method";
//    }
//}

//✅ This is the final working code:

package com.example.demo.service;

import com.example.demo.models.Employee;
 // ✅ fixed import
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MyService {

    // Initialize the employee list
    List<Employee> empList = new ArrayList<>(
            Arrays.asList(
                    new Employee(1, "Prasanth", "Trainer"),
                    new Employee(2, "Yuvaraj", "Faculty")
            )
    );

    // POST method
    public String postMethod() {
        return "Post method called successfully";
    }

    // GET method
    public String getWelcomeMessage() {
        return "Get method called successfully";
    }

    // PUT method
    public String putMethod() {
        return "Put method called";
    }

    // DELETE method
    public String deleteMethod() {
        return "Delete method called";
    }

    // Get all employees
    public List<Employee> getAllEmployees() {
        return empList;
    }

    // Add a new employee
    public void addEmployee(Employee emp) {
        empList.add(emp);
    }
}
