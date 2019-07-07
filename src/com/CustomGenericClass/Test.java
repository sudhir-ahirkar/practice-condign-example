package com.CustomGenericClass;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sudhir.ahirkar on 12/12/2017.
 */
public class Test {

    public static void main(String[] args) {

        Employee<List<Address>> addressEmployee=new Employee<>();

        Employee<Address> employee=new Employee<>();

        Address address=new Address();
        Address address1=new Address();

        List<Address> lst=new ArrayList<>();
        lst.add(address);
        lst.add(address1);
        addressEmployee.add(lst);

        employee.add(address);
//        addressEmployee.add(address1);
//        Address i=  addressEmployee.getObj();
    }
}
