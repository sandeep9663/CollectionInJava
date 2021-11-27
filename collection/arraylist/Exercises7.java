 //Write a Java program to search an element in a array list
package com.deep.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Exercises7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List ls = new ArrayList();

		ls.add("a");
		ls.add("b");
		ls.add("c");
		ls.add("d");
		ls.add("e");
		ls.add("f");
		
		System.out.println("result:"+ls);
		if(ls.contains("g")) 
		{
	System.out.println("element is found");
		}
		else {
	System.out.println("elements is not found");
        }
		
		
	}


}