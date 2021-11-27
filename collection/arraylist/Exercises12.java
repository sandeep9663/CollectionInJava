//Write a Java program to extract a portion of a array list     sublist
package com.deep.collection.arraylist;
import java.util.*;
public class Exercises12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  List <Integer> list =new ArrayList<>();
    list.add(2);
	list.add(3);
	list.add(1);
	list.add(5);
	list.add(6);
	System.out.println(list);
	
	
	System.out.println( list.subList(0, 3));    //using sublist
	
	
	}

}
