package ru.strebkov.dz_Spring_Jdbc.model;

import lombok.AllArgsConstructor;
import lombok.Data;

//@Data
//@AllArgsConstructor
public class Customers {
    private int id;
    private String name;
    private String surname;
    private int age;
    private String phone_namber;

   // public Customers(){}

    public Customers(int id, String name, String surname, int age, String phone_namber) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phone_namber = phone_namber;
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

    public String getSurename() {
        return surname;
    }

    public void setSurename(String surename) {
        this.surname = surename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNamber() {
        return phone_namber;
    }

    public void setPhoneNamber(String phone_namber) {
        this.phone_namber = phone_namber;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surename='" + surname + '\'' +
                ", age=" + age +
                ", phone_namber='" + phone_namber + '\'' +
                '}';
    }
}
