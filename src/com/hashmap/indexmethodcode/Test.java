package com.hashmap.indexmethodcode;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println(indexFor(215,15));
  HashMap hm=new HashMap();
	}
	
	static int indexFor(int h, int length) {
		   return h & (length-1);
		}

}
