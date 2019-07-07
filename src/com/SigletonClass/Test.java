package com.SigletonClass;

/**
 * Created by sudhir.ahirkar on 11/17/2017.
 */
public class Test {

    public static void main(String args[]){

        Sigleton sigleton=  Sigleton.getSigleton();
        Sigleton sigleton2=  Sigleton.getSigleton();
        System.out.println("sigleton1==========>"+sigleton2);
        System.out.println("sigleton1 hashcode==========>"+sigleton.hashCode());
        System.out.println("sigleton2==========>"+sigleton2);
        System.out.println("sigleton2 hashcode==========>"+sigleton2.hashCode());
    }
}
