package com.CheckAccessModifierThingOfPrivate;

/**
 * Created by sudhir.ahirkar on 12/12/2017.
 */
public class Test1 {
public static final int y=8;
int l=0;
    public static void main(String[] args) {

//        Error:(11, 19) java: i has private access in com.CheckAccessModifierThingOfPrivate.Test
//       int i= Test.i;

        int j= Test.j;
        int l= Test.j;

        System.out.println("i===>"+j+" "+l); //i===>0 0
    	
//        Error:(17, 9) java: cannot assign a value to final variable y
//        y=9;
    }




   /* Answer: Well this is a strange situation. We all have seen NullPointerException when we invoke a method on object that is NULL. But here this program will work and prints â€œTest foo calledâ€�.

    The reason for this is the java compiler code optimization. When the java code is compiled to produced byte code, it figures out that foo() is a static method and should be called using class. So it changes the method call obj.foo() to Test.foo() and hence no NullPointerException.
    */
//    public static String foo(){
//        System.out.println("Test foo called");
//        return "";
//    }

//    public static void main(String args[]){
//        Test1 obj = null;
//        System.out.println(obj.foo());
//    }
}
