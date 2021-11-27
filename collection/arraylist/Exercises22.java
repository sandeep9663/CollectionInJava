
//Write a Java program to print all the elements of a ArrayList using the position of the elements
package com.deep.collection.arraylist;
//import java.util.ArrayDeque;
import java.util.ArrayList;
//import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class Exercises22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list =new ArrayList();
		
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(5);
		list.add(6);
		
		System.out.println(list);
		int s= list.size();
		System.out.println("<<<<<<<<<<<<using for loop>>>>>>>>>>>>");
		for(int i =0;i<s;i++)
			System.out.println(list.get(i));
	

	System.out.println("<<<<<<<<<<<<<using fro each>>>>>>>>>>>>");
	for(Object i:list)
	{
		System.out.println(i);
	}
	
	System.out.println("<<<<<<<<<<<<<Iterator>>>>>>>>>>>>");
	ListIterator itr=list.listIterator();
	
	System.out.println("ele="+itr.next());        // first occourance element
	
	while(itr.hasNext())
	
	{
		System.out.println(itr.next());
	
	}
	
	System.out.println(itr.next());
	
	 while (itr.hasPrevious()) {
         System.out.println(""+itr.previous());
	
	
	
}
}

}