package com.java.lang;

/**
 * Created by sudhir.ahirkar on 12/11/2017.
 */
public class ToStringStufff {
    String s="asdf";
	
	public ToStringStufff(String s){
		this.s=s;
	}
    public String toString(){
        return "test";
    }

public static void main(String args[]){
    ToStringStufff toStringStufff=new ToStringStufff("sdfasdfasdf");

    String s=new String("Durga");

    System.out.println(s);
    System.out.println(toStringStufff);
}
}


