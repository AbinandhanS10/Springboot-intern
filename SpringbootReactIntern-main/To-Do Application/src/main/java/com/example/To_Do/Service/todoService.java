package com.example.To_Do.Service;

import com.example.To_Do.Model.todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class todoService {

    List<todo> to = new ArrayList<>();

    public todoService(){
        to.add(new todo(1, "Mohan", "Start the Project","Yet to Start"));
        to.add( new todo(2, "Prasath", "Push to GitHub","Yet to Start"));
    }

    public List<todo> getAlltask(){
        return to;
    }

    public todo getTaskbyid(int id){
        int ind = 0;
        boolean flag = false;
        for(int i=0;i < to.size();i++){
            if(id == to.get(i).getId()){
                ind = i;
                flag = true;
                break;
            }
        }
        if(flag){
            return to.get(ind);
        }
        else{
            return new todo();
        }
    }

    public String addTask(todo task) {
        task.setStatus("Yet to Start"); // default stage
        to.add(task);
        return "Task Added Successfully";
    }

    public String updateTask(todo updatedTask) {
        for (int i = 0; i < to.size(); i++) {
            todo currentTask = to.get(i);
            if (updatedTask.getId() == currentTask.getId()) {

                // Update fields only if they are not null
                if (updatedTask.getName() != null) {
                    currentTask.setName(updatedTask.getName());
                }

                if (updatedTask.getTitle() != null) {
                    currentTask.setTitle(updatedTask.getTitle());
                }

                if (updatedTask.getStatus() != null) {
                    currentTask.setStatus(updatedTask.getStatus());
                }

                return "Task updated successfully";
            }
        }
        return "No such task existed";
    }

    public String deletetask(int id){
        int ind = 0;
        boolean flag = false;
        for(int i=0;i<to.size();i++){
            if(id == to.get(i).getId()){
                ind = i;
                flag = true;
            }
        }
        if(flag){
            to.remove(ind);
            return "Task Deleted successfully";
        }
        else{
            return "No Such Task Existed";
        }
    }
}
