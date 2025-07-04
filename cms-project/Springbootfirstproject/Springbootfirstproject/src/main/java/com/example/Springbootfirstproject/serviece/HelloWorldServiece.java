package com.example.Springbootfirstproject.serviece;

import com.example.Springbootfirstproject.models.Employee;
import com.example.Springbootfirstproject.models.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

//Employee emp = new Employee();



@Service
public class HelloWorldServiece
{

    //employee

    ArrayList<Employee> e = new ArrayList<>(
            Arrays.asList(new Employee(1,"prasanth","Trainer"),
                    new Employee(2,"Sumo","therla")
            )
    );


    public void deleteEmpById(int id) {
        e.removeIf(emp -> emp.getEmpid() == id);
    }


    public void setvalue(Employee emp)
    {
        e.add(emp);
    }


    public ArrayList<Employee> getallEmp()
    {
        return e;
    }

    public Employee getEmpById(int id) {
        for (Employee emp : e) {
            if (emp.getEmpid() == id) {
                return emp;
            }
        }
        return null; // or throw exception
    }

    public void updateEmp(int id, Employee updatedEmp) {
        for (int i = 0; i < e.size(); i++) {
            if (e.get(i).getEmpid() == id) {
                e.set(i, updatedEmp);
                return;
            }
        }
    }




    //student

    ArrayList<Student> s = new ArrayList<>(
            Arrays.asList(new Student(001,"abii","ece"),
                    new Student(002,"sugu","cse"),
                    new Student(003,"kavin","mech")
            )
    );

    public Student getStudentByRoll(int roll) {
        for (Student std : s) {
            if (std.getRoll() == roll) {
                return std;
            }
        }
        return null; // or throw exception
    }

    public void updateStudent(int roll, Student updatedStd) {
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).getRoll() == roll) {
                s.set(i, updatedStd);
                return;
            }
        }
    }


    public void setStudents(Student std)
    {
        s.add(std);
    }


    public void deleteStudentByRoll(int roll) {
        s.removeIf(std -> std.getRoll() == roll);
    }


    public ArrayList<Student> getStudents()
    {
        return s;
    }


    //General

    public String get()
    {
        return "Hello World from serviece get method";
    }

    public String post()
    {
        return "Hello World from Serviece  post method ";
    }

    public String put()
    {
        return "Hello World from Serviece  put method ";
    }

    public String del()
    {
        return "Hello World from Serviece  delete method ";
    }

}

