package com.example.Springbootfirstproject.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int empid;
    private String ename;
    private String email;
    private String password;
    private String bob;

    public UserDetails() {

    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public UserDetails(int empid, String ename, String email, String password, String bob) {
        this.empid = empid;
        this.ename = ename;
        this.email = email;
        this.password = password;
        this.bob = bob;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBob() {
        return bob;
    }

    public void setBob(String bob) {
        this.bob = bob;
    }
}
