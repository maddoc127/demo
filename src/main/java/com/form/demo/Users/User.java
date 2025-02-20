package com.form.demo.Users;

public class User {
    private String name;
    private int age;
    private String Surname;

    public User() {
    }

    public User(String name, String Surname ,int age) {
        this.name = name;
        this.Surname = Surname;
        this.age = age;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname(){
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
