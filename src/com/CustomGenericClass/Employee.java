package com.CustomGenericClass;

import java.util.List;

/**
 * Created by sudhir.ahirkar on 12/12/2017.
 */
public class Employee<T> {

T address;

    private List<T> listAdd;


    Employee(T obj){
        this.address=obj;
    }

    public Employee() {

    }

   public void add(T t){
       this.address=t;
   }

    public void addList(T t){
        listAdd.add(t);
    }


    public  T getObj(){
        return  address;
    }
}
