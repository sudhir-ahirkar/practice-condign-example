package com.practice.stringexample.removestring;

/**
 * Created by sudhir.ahirkar on 11/14/2017.
 */
public class ReplaceOrRemoveString {

    public static void main(String args[]) {
        String test = "Sudhir Ahirkar";
        removeString(test, 'y');
        System.out.println("test===ad===>" + test);
    }

    public static void removeString(String test, char c) {
        String check = test.replaceAll("A", Character.toString(c));
        System.out.println("check======>" + check);
    }
}
