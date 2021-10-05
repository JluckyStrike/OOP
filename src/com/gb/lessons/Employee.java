package com.gb.lessons;

public class Employee {
    private String fio;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Employee(String fio, String position, String email, String phone, double salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getFio() {
        return fio;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }



    public void print(){
        System.out.println("\nФИО: " + this.fio +
                           "\nДолжность: " + this.position +
                           "\nПочта: " + this.email +
                           "\nТелефон: " + this.phone +
                           "\nЗарплата: " + this.salary +
                           "\nВозраст: " + this.age);
    }
}
