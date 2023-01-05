package com.Default_Value_Of_Array;

/**
 * Created by sudhir.ahirkar on 12/2/2017.
 */
public class Test {
    public static void main(String[] args)
    {
        System.out.println("check default value of String array===>"+args.length);

        /*Exception in thread "main" check default value of String array===>0
        java.lang.ArrayIndexOutOfBoundsException: 0
        at com.Default_Value_Of_Array.Test.main(Test.java:10)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:497)
        at com.intellij.rt.execution.application.AppMain.main(AppMain.java:144)*/
//        System.out.println("check default value of String array===>"+args[0]);

        System.out.println("String array default values:");
        String str[] = new String[5];
        for (String s : str)
            System.out.print(s + " ");

        System.out.println("\n\nInteger Object array default values:");
        Integer obj[] = new Integer[5];
        for (Integer val : obj)
            System.out.print(val + " ");

        System.out.println("\n\nInteger array default values:");
        int num[] = new int[5];
        for (int val : num)
            System.out.print(val + " ");

        System.out.println("\n\nDouble array default values:");
        double dnum[] = new double[5];
        for (double val : dnum)
            System.out.print(val + " ");

        System.out.println("\n\nBoolean array default values:");
        boolean bnum[] = new boolean[5];
        for (boolean val : bnum)
            System.out.print(val + " ");

        System.out.println("\n\nReference Array default values:");
        ArrayDemo ademo[] = new ArrayDemo[5];
        for (ArrayDemo val : ademo)
            System.out.print(val + " ");
    }
}
