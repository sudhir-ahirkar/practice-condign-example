package com.FindOutDuplicatElementOfArray;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sudhir.ahirkar on 12/3/2017.
 */
public class Test {
    public static void main(String args[]) {

        String ar[]={"java","Array","Anil","java","Nilesh","Anil"};

        Set<String> nonDuplicates=new HashSet<>();
        Set<String> duplicates=new HashSet<>();




		for (String s : ar) {
			if (nonDuplicates.contains(s))
				duplicates.add(s);
			else
				nonDuplicates.add(s);
		}

        System.out.println("nonDuplicates==>"+nonDuplicates);
        System.out.println("duplicates==>"+duplicates);

    }
}