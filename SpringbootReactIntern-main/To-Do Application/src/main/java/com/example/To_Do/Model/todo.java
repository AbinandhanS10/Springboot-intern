package com.example.To_Do.Model;

public class todo {
    private int id;
    private String name;
    private String title;
    private String status;

    public todo(int id,String name, String title, String status) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.status = status;
    }

    public todo() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
