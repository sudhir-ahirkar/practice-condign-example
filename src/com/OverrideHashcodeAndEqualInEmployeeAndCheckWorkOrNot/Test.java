package com.OverrideHashcodeAndEqualInEmployeeAndCheckWorkOrNot;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sudhir.ahirkar on 12/31/2017.
 */
public class Test {

    public static void main(String[] args) {

        Employee employee1=new Employee();
        employee1.setId(1);
        employee1.setName("Sudhir");

        Employee employee2=new Employee();
        employee2.setId(1);
        employee2.setName("Sudhir");

        Employee employee3=new Employee();
        employee3.setId(1);
        employee3.setName("Arjun");

        Set<Employee> empSet=new HashSet<>();
        empSet.add(employee1);
        empSet.add(employee2);
        empSet.add(employee3);

        System.out.println("Check size===>"+empSet.size());
    }


}
