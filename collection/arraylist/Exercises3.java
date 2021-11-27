
//Write a Java program to insert an element into the array list at the first position.
package com.deep.collection.arraylist;
import java.util.*;
public class Exercises3 {
	
	
	  public static void main(String[] args)
	  
	  {
	    
	    List <Integer> list = new ArrayList<>();
	    list.add(1);
	    list.add(2);
	    list.add(3);
	    list.add(4);
	    
	    System.out.println(list);
	    
	list.add(1,0);    // index , element
	    System.out.println(list);
	    
	  }
	}

