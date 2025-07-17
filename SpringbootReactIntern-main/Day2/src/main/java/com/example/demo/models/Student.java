package com.example.demo.models;

public class Student {
    private int userid;
    private String name;
    private String course;

    public Student(int userid, String name, String course) {
        this.userid = userid;
        this.name = name;
        this.course = course;
    }

    // Getters
    public int getUserid() {
        return userid;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    // Setters
    public void setUserid(int userid) {
        this.userid = userid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
