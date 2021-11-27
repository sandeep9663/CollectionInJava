// Write a Java program to trim the capacity of an array list the current list size.
package com.deep.collection.arraylist;
import java.util.*;
public class Exercises19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		System.out.println(list);
		 ((ArrayList<String>) list).trimToSize();   //casting is required.
		  
        System.out.println("The List elements are:");
  
        // prints all the elements
        for (String number : list) {
            System.out.println("Number = " + number);
        }
			
		list.add("g");
		System.out.println(list);
	}

}
