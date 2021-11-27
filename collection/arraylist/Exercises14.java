//Write a Java program of swap two elements in an array list
package com.deep.collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercises14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list =new ArrayList();
		
		list.add("Black");
		list.add("white");
		list.add("green");
		list.add("red");
		list.add("Yellow");
		list.add("Blue");
		
		for(Object o : list)
		{
			System.out.println(o);
		}
		System.out.println("<<<<<<<<<<<<<<swap element>>>>>>>>>>>>>>>>>");
		Collections.swap(list, 0, 5);
		
		for(Object o1:list)
		{
			System.out.println(o1);
		}
		
	
	}
	
	
	

}
