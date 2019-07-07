package com.RemoveString;

/**
 * Created by sudhir.ahirkar on 12/12/2017.
 */
public class Test {

    public static void main(String[] args) {
       String s= removeChar("Sudhir Ahirkar", 'A');
        System.out.println(s);
    }

    private static String removeChar(String str, char c) {
        if (str == null)
            return null;
        return str.replaceAll(Character.toString(c), "");
    }
}
