package com.inheritance.concept;

public class B extends A {

  
  
  public void abc(Integer s) {
    System.out.println("Inside B class");
  }
  
  public static void main(String args[]) {
    
    B a=new B();
    a.abc("");
  }
}
