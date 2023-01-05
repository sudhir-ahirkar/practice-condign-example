package com.What_var_args_variables;

import java.util.Arrays;

/**
 * Created by sudhir.ahirkar on 12/2/2017.
 */
public class VarargsExample1 {

    /*Variable Argument (Varargs):

    The varrags allows the method to accept zero or muliple arguments. Before varargs either we use overloaded method or take an array as the method parameter but it was not considered good because it leads to the maintenance problem. If we don't know how many argument we will have to pass in the method, varargs is the better approach.

    Advantage of Varargs:

    We don't have to provide overloaded methods so less code.*/

    /*Syntax of varargs:

    The varargs uses ellipsis i.e. three dots after the data type. Syntax is as follows:

    return_type method_name(data_type... variableName){}*/

    static void display(String... values){

        System.out.println("display method invoked ");
        Arrays.stream(values).forEach(e->System.out.println(e));
    }

    public static void main(String args[]){

        display();//zero argument
        display("my","name","is","varargs");//four arguments
    }
}
