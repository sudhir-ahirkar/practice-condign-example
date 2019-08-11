package com.hashsetandtreesetexample;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		[null, Sagar, Ahirkar, Sudhir]
		Set<String> hashSet=new HashSet();
		hashSet.add(null);
		hashSet.add("Sudhir");
		hashSet.add("Sagar");
		hashSet.add(null);
		hashSet.add("Ahirkar");
		hashSet.add(null);
		System.out.println(hashSet);
		
		
		
		
//		Exception in thread "main" java.lang.NullPointerException
//		at java.util.TreeMap.put(Unknown Source)
//		at java.util.TreeSet.add(Unknown Source)
//		at com.hashsetandtreesetexample.Test.main(Test.java:26)
		Set<String> treeSet=new TreeSet();
		treeSet.add(null);
		treeSet.add("Sudhir");
		treeSet.add("Sagar");
//		treeSet.add(null);
		treeSet.add("Ahirkar");
//		treeSet.add(null);
		System.out.println(treeSet);


	}

}
