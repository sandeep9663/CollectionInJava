//Write a Java program to test an array list is empty or not
package com.deep.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Exercises18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		list.clear();
		System.out.println(list.isEmpty());
		
		System.out.println(list);
	}

}
