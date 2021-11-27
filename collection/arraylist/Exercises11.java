
//Write a Java program to reverse elements in a array list
package com.deep.collection.arraylist;
import java.util.*;
public class Exercises11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List <String> list =new ArrayList<>();
		list.add("Black");
		list.add("white");
		list.add("red");
		list.add("Yellow");
		list.add("Blue");
		
		System.out.println("list:="+list);
		
		Collections.reverse(list);
		
	
			
			System.out.println(list);
			
	
		
		
	}

}
