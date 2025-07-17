package com.example.To_Do.Controller;

import com.example.To_Do.Model.todo;
import com.example.To_Do.Service.todoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class todoController {

    @Autowired
    todoService t;

    @GetMapping("/get")
    public List<todo> getAlltask(){
        return t.getAlltask();
    }

    @GetMapping("/{id}")
    public todo getTaskByid(@PathVariable int id){
    return t.getTaskbyid(id);
    }

    @PostMapping
    public String addtask(@RequestBody todo tod){
        return t.addTask(tod);
    }

    @PutMapping("/update")
    public String updateTask(@RequestBody todo tod){
        return t.updateTask(tod);
    }

    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable int id){
        return t.deletetask(id);
    }
}
