
//Write a Java program to shuffle elements in a array list
package com.deep.collection.arraylist;
import java.util.*;
public class Exercises10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(5);
		list.add(6);
		System.out.println(list);
	
		Collections.shuffle(list);
		
		System.out.println("updatelist="+list);
	}

}
