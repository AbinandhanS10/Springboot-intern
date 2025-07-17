package com.example.Student.Services;

import com.example.Student.Models.StudentModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    List<StudentModel> student =new ArrayList<>(List.of(
            new StudentModel(1,"Sriram",20),
            new StudentModel(2,"Sanjith",19)
    ));

    public void addStudent(StudentModel s){
        student.add(s);
    }

    public List getAllStudents(){
        return student;
    }


    public StudentModel getStudentById(int id) {
    for(StudentModel s:student){
        if(s.getId() == id){
            return s;
        }
    }
    return null;
}


public String updateStudent(StudentModel s) {
    int ind = 0;
    boolean flag = false;
    for(int i=0;i<student.size();i++){
        if(s.getId() == student.get(i).getId()){
            ind = i;
            flag = true;
            break;
        }
    }
    if(flag){
        student.set(ind,s);
        return "Updated Student Successfully";
    }
    else{
        return "Student not found";
    }
}

public String deleteStudentById(int id) {
    int ind = 0;
    boolean flag = false;
    for(int i=0;i<student.size();i++){
        if(id == student.get(i).getId()){
            ind = i;
            flag = true;
        }
    }
    if(flag){
        student.remove(ind);
        return "Student deleted Succesfully";
    }
    else{
        return "Student not found";
    }

}
}