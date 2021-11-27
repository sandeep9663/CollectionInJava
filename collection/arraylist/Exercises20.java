
//Write a Java program to increase the size of an array list
package com.deep.collection.arraylist;


import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class Exercises20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>(3);
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);
		((ArrayList<String>) list).ensureCapacity(6);			//ensureCapacity  typecasting required
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("w");
		
		System.out.println(list);
	}

}
