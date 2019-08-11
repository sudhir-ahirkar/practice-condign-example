package com.recursion.wipro.example;

public class FactorialUsingRecursion {
	static Integer count=1;
	public static void main(String[] args) {

		Integer n=4;
	Integer count=	getFactorialResult(n);
	System.out.println(count);
		
		
	}

	private static Integer getFactorialResult(Integer n) {
		
		
		if(n!=0) {
			count=count*n;
			getFactorialResult(--n);
			
		}
		
		return count;
		
		
	}

}
