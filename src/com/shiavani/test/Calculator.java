package com.shiavani.test;

import java.util.Scanner;

public class Calculator {
    static boolean isNextOperationRequire = true;

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        while (isNextOperationRequire) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number");
            int a = sc.nextInt();
            System.out.println("Enter second number");
            int b = sc.nextInt();
            System.out.println("Which operation, do you want to perform");
            String operation = sc.next();
            double result = 0;
            try{
                switch (operation) {
                    case "add":
                        result = cal.add(a, b);
                        break;
                    case "sub":
                        result = cal.sub(a, b);
                        break;
                    case "mul":
                        result = cal.mul(a, b);
                        break;
                    case "div":
                        result = cal.div(a, b);
                        break;
                    default:
                        throw new IllegalArgumentException("Please provide valid operation type");
                }
            }catch (Exception ex){


            }

            System.out.println("Final result is :" + result);
            System.out.println("Do you want to perform next operation ?");
            isNextOperationRequire = sc.nextBoolean();
        }

    }


    public int add(int a, int b) {
        return a + b;
    }

    private int sub(int a, int b) {
        return a - b;

    }

    private int mul(int a, int b) {
        return a * b;

    }

    private double div(int a, int b) {
        return a / b;
    }
}
