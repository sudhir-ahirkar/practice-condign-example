package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomObjectExample {

    public static void main(String[] args) {
        Employee e1 = new Employee("Sudhir",25,2500.0,1,"Ahirkar");
        Employee e2 = new Employee("Sagar",26,4500.0,4,"Ahirkar");
        Employee e3 = new Employee("Hira",30,3500.0,7,"Pathe");
        Employee e4 = new Employee("Sudhir",25,1500.0,1,"Harde");

        List<Employee> lst = Arrays.asList(e1,e2,e3,e4);

        List<Employee> sortListWithFirstAndThenLast = lst.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getLastName)).collect(Collectors.toList());
        System.out.println("sortListWithFirstAndThenLast===>"+sortListWithFirstAndThenLast);
        Map<Integer, List<Employee>> mapWithKeyIdAndEmplist = lst.stream().collect(Collectors.groupingBy(Employee::getId, Collectors.toList()));
        System.out.println("mapWithKeyIdAndEmplist===>"+mapWithKeyIdAndEmplist);



    }

}
