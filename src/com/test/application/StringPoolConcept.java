package com.test.application;

public class StringPoolConcept {

  public static void main(String ar[] ){
    
    String s=new String("Sudhir");
    String s1 ="Sudhir";
    System.out.println(s1==s.intern());
    String s2=s1.concat("");
    System.out.println(s2==s1);
    
  }
}
