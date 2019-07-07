package com.OverrideHashcodeAndEqualInEmployeeAndCheckWorkOrNot;

import java.io.Serializable;

/**
 * Created by sudhir.ahirkar on 12/31/2017.
 */
public class Employee implements Serializable{

    private int id;

    private String name;

    private String department;

    private int age;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
//        return super.hashCode();

        return getName().hashCode()+id;
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        if(obj==null){
            return false;
        }
        if(!(obj instanceof Employee)){
            return false;
        }
        Employee employee=(Employee) obj;
        if(getId()==employee.getId() & getName().equals(employee.getName()))
            return true;
        else
            return  false;
    }
}
