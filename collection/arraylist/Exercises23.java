package com.deep.collection.arraylist;



	import java.util.ArrayDeque;
	import java.util.ArrayList;
	import java.util.Deque;
	import java.util.Iterator;
	import java.util.List;
	import java.util.ListIterator;
	public class Exercises23 {
	  public static void main(String[] args) {
		   List<Integer>  li = new ArrayList<>();
			 
			  li.add(22);
			  li.add(44);
			  li.add(88);
			  li.add(11);
			  li.add(33);
			  ListIterator<Integer>  itr = li.listIterator();
			  System.out.println("In actual order :");
			  while (itr.hasNext()) {
		            System.out.println(itr.next());
		        }
			  System.out.println("In reverse order :");
			  
			  while (itr.hasPrevious()) {
		            System.out.println(""+itr.previous());
		     }
		} 
	}

