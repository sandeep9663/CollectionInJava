
//Write a Java program to copy one array list into another.
package com.deep.collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercises9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

List<String> list1 = new ArrayList<>();
		
		list1.add("abc");
		list1.add("bcd");
		list1.add("def");
		list1.add("cde");
		System.out.println("old  list:"+list1);
		
List<String> list2 = new ArrayList<>();
		
		list2.add("1");
		list2.add("2");
		list2.add("3");
		list2.add("4");
		
		System.out.println("  list:"+list2);	
	ArrayList<String> newlist = new ArrayList<>(list1);
    	System.out.println("anoter List:"+newlist);
	
	
	
	
	
	Collections.copy(list2,list1);						// list 1 copy in to another list 2 
//		System.out.println(" List:"+list1);
//		System.out.println("  list:"+list2);
	System.out.println(list2+"/n"+list1);	
	
	}

}
