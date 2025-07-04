package com.example.Springbootfirstproject.models;

public class Student
{
    private int Rollno;
    private String Name;
    private String Dept;


    public Student()
    {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Rollno == student.Rollno;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(Rollno);
    }



    public Student(int rollno,String name,String dept)
    {
        this.Rollno=rollno;
        this.Name=name;
        this.Dept=dept;
    }

    public int getRoll()
    {
        return Rollno;
    }

    public void setRoll(int roll)
    {
        Rollno = roll;
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String name)
    {
        Name = name;
    }

    public String getDept()
    {
        return Dept;
    }

    public void setDept(String dept)
    {
        Dept = dept;
    }
}
