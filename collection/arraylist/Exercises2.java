
//. Write a Java program to iterate through all elements in a array list.

package com.deep.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercises2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List ls = new ArrayList();

		ls.add("a");
		ls.add("b");
		ls.add("c");
		ls.add("d");
		ls.add("e");
		ls.add("f");
		System.out.println("list:"+ls);
		System.out.println("<<<<<<<<<<<<<itretor>>>>>>>>>>>>>>>");
		Iterator itr =ls.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
		
		System.out.println("<<<<<<<<<<<<<itreate though for each loop>>>>>>>>>>>>>>>");
		
	for(Object o:ls)
	{
		System.out.println(o);
	}
	
	
	
	
	}
	
	

}
