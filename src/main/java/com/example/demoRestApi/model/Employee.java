package com.example.demoRestApi.model;

public class Employee {
    private int Id;
    private String name;
    private String phone;

    public Employee(int id, String name, String phone) {
        Id = id;
        this.name = name;
        this.phone = phone;
    }

    public Employee() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
