
//Write a Java program to replace the second element of a ArrayList with the specified element.
package com.deep.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Exercises21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		
		
		list.set(0,"B");
		
	for(int index=0;index<list.size();index++ )
	{
		System.out.println(list.get(index));
	}
	}

}
