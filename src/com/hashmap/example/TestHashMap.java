package com.hashmap.example;

import java.util.HashMap;
import java.util.HashSet;

public class TestHashMap {

  public static void main(String[] args) {

    Student s1=new Student();
    Student s2=new Student();
    Student s3=new Student();
//    Student s4=new Student();
    
    HashMap<Student,Integer> hm=new HashMap<>();
//    
    hm.put(s1, 0);
//    hm.put(s2, 0);
//    hm.put(s2, 0);
//    hm.put(s3, 0);
    
    HashSet<Student> hd=new HashSet<>();
    hd.add(s1);
    hd.add(s2);
    hd.add(s3);
    
    System.out.println(hd.hashCode());
    
    Long l1=new Long(225L);
    System.out.println(l1.hashCode());
    
  }

}
