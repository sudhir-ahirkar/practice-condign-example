package com.CheckSomeImportantConcept;

import java.util.Objects;

/**
 * Created by sudhir.ahirkar on 12/11/2017.
 */
public class Test {

    public static void main(String[] args) {

        String s=new String("Sudhir");

        Object obj=(Object)s;

        System.out.println("s==>"+s);
        System.out.println("obj==>"+obj);
        System.out.println(s==obj);


        Integer i=new Integer(10);

        Object o=(Object)i;

        System.out.println(i==o);
    }
}
