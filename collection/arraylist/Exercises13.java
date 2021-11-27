//Write a Java program to compare two array lists
package com.deep.collection.arraylist;
import java.util.*;
public class Exercises13 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list =new ArrayList();
		
		list.add("Black");
		list.add("white");
		list.add("green");
		list.add("red");
		list.add("Yellow");
		list.add("Blue");
		
		
		System.out.println("list1:"+list);

		List list1 =new ArrayList();
		
		list1.add("Black");
		list1.add("white");
		list1.add("light");
		list1.add("red");
		list1.add("Yellow");
		list1.add("Blue");
	
		ArrayList al=new ArrayList();
		
		for(Object a:list)
		{
		if(al.add(list1.contains(a)))
				{
			System.out.println(al);
			
		}
	
	}

	}
}
