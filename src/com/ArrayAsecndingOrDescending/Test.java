package com.ArrayAsecndingOrDescending;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by sudhir.ahirkar on 12/3/2017.
 */
public class Test {

    public static void main(String args[]){

        String string[]={"Sudhir","Rakesh","Godawari","Arjun"};

        for(String s: string)
        System.out.println("before sorting==>"+s);
        System.out.println("===========================");
        Arrays.sort(string);
        for(String s: string)
        System.out.println("Ascending sorting==>"+s);
        System.out.println("===========================");

        Arrays.sort(string, Collections.reverseOrder());
        for(String s: string)
            System.out.println("Descending sorting==>"+s);
        
       Object b =new Object();

}



}
