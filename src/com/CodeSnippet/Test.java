package com.CodeSnippet;

import java.util.ArrayList;

/**
 * Created by sudhir.ahirkar on 11/18/2017.
 */
public class Test {
    public static void main(String args[]){
        String obj = "hello"+'"'+"How are you";

        System.out.println("obj======>"+obj);
        String new_obj= obj.replaceAll("\"", "");
        System.out.println("new_obj======>"+new_obj);
        ArrayList l=new ArrayList<String>();
        l.add(10);
        l.add("123");
        int i=100;
        int j=200;
        /*while(++i < --j){
            System.out.println(i);
        }*/

        while(++i < --j);
            System.out.println("======"+i);

    }
}
