package com.test.application;

public class Employee {
private String name;
private Integer id;

public Employee(Integer id,String name) {
  this.name=name;
  this.id=id;
}

@Override
public String toString() {
  return "Employee [name=" + name + ", id=" + id + "]";
}

public String getName() {
  return name;
}

public void setName(String name) {
  this.name = name;
}

public Integer getId() {
  return id;
}

public void setId(Integer id) {
  this.id = id;
}


}
