package com.code.java8.concept.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAsListConcept {

  public static void main(String[] args) {
    
    Integer i1=10;
//    Integer i2=10;
    Integer i2=Integer.valueOf(10);
    Integer i3=1000;
    Integer i4=1000;
    System.out.println(i1==i2);
    System.out.println(i3==i4);
    // TODO Auto-generated method stub
    
//    List l=Arrays.asList(1,5,9,3,7);
//    l.add("asd");
//    
//    System.out.println(l);
    
//    Exception in thread "main" java.lang.UnsupportedOperationException
//    at java.util.AbstractList.add(Unknown Source)
//    at java.util.AbstractList.add(Unknown Source)
//    at com.code.test.ArrayAsListConcept.main(ArrayAsListConcept.java:12)
    
//   Because underlying datastructure is array only so once created then can't add more
    
//    
//    List l=Arrays.asList(1,5,9,3,7);    
//    l.set(1, 10);
//    l.set(3, 10f);
//    System.out.println(l);
    
//    Exception in thread "main" java.lang.ArrayStoreException: java.lang.Float
//    at java.util.Arrays$ArrayList.set(Unknown Source)
//    at com.code.test.ArrayAsListConcept.main(ArrayAsListConcept.java:26)
//    Because uderlying data-structure is Array only so it's homogenous

    
    
//    Note: We can avoid this issues
/// It is for allow for all data
    
//    List l=new ArrayList<>(Arrays.asList(1,5,9,3,7));    
//    l.set(1, 10);
//    l.set(3, 10f);
//    System.out.println(l);
    
    
//  It is meant for generic only so below code will get compile type error
    
//  List<Integer> l=new ArrayList<>(Arrays.asList(1,5,9,3,7));    
//  l.set(1, 10);
//  l.set(3, 10f);
//  System.out.println(l);
  }

}
