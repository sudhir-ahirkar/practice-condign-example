package com.java8;

public class Employee {
    private String name;
    private int age;
    private Double salary;
    private Integer id;
    private String lastName;

    public Employee(String name, int age, Double salary, Integer id) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.id = id;
    }

    public Employee(String name, int age, Double salary, Integer id, String lastName) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.id = id;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", id=" + id +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
