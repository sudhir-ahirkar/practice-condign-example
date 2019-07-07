package com.Arrayprogram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by sudhir.ahirkar on 12/16/2017.
 *
 *
 * Program to check valid mobile number
 Mobile Number validation criteria:

 The first digit should contain number between 7 to 9.
 The rest 9 digit can contain any number between 0 to 9.
 The mobile number can have 11 digits also by including 0 at the starting.
 The mobile number can be of 12 digits also by including 91 at the starting
 The number which satisfies the above criteria, is a valid mobile Number.

 Examples:

 Input : Enter Mobile Number:
 7873923408
 Output :Valid Mobile Number

 Input : Enter Mobile Number:
 5678729234
 Output :Invalid Mobile Number
 */
public class ProgramToCheckValidMobilNum {

    public static boolean isValid(String s)
    {
        // The given argument to compile() method
        // is regular expression. With the help of
        // regular expression we can validate mobile
        // number.
        // 1) Begins with 0 or 91
        // 2) Then contains 7 or 8 or 9.
        // 3) Then contains 9 digits
        Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}");

        // Pattern class contains matcher() method
        // to find matching between given number
        // and regular expression
        Matcher m = p.matcher(s);
        return (m.find() && m.group().equals(s));
    }

    public static void main(String[] args)
    {
        String s = "347873923408";
        if (isValid(s))
            System.out.println("Valid Number");
        else
            System.out.println("Invalid Number");
    }
}
