package com.code.java8.concept.test;

import java.util.List;

public class User {

  
  private String name;
  private int age;
  private List<String> phones;
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
  public List<String> getPhones() {
    return phones;
  }
  public void setPhones(List<String> phones) {
    this.phones = phones;
  }
  public User(String name, int age, List<String> phones) {
    super();
    this.name = name;
    this.age = age;
    this.phones = phones;
  }
  
  
  
}
