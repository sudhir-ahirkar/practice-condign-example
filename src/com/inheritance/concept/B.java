package com.inheritance.concept;

public class B extends A {

  
  
  public void abc(Integer s) {
    System.out.println("Inside B class");
  }

  public void xyz(Integer s) {
    System.out.println("Inside A class but method is xyz in B");
  }
  
  public static void main(String args[]) {
    
    B a=new B();
    a.abc("");
    a.xyz(2);

  }
}
