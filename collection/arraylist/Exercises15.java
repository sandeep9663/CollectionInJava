
// Write a Java program to join two array lists.
package com.deep.collection.arraylist;
import java.util.*;
public class Exercises15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		System.out.println(list);
		
		
		List<String> list1 = new ArrayList<>();
		list1.add("p");
		list1.add("q");
		list1.add("r");
		list1.add("s");
		list1.add("t");
		list1.add("u");
		
		System.out.println(list1);
		
		
		
		list1.addAll(list);
		System.out.println(list1);
		
//		List<String> list3 = new ArrayList<>();
//		
//		
//		list3.addAll(list);
//		list3.addAll(list1);
//		
//		System.out.println(list3);
	}

}
