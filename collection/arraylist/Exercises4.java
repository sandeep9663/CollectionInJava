
//Write a Java program to retrieve an element (at a specified index) from a given array list.;
package com.deep.collection.arraylist;

import java.util.*;

public class Exercises4 {

  public static void main(String[] args)
	  
	  {
	    
	    List <Integer> list = new ArrayList<Integer>();
	    list.add(1);
	    list.add(2);
	    list.add(3);
	    list.add(4);
	    
	    System.out.println(list);
	    
	//list.add(0,5);    // index , element
	
	
	    System.out.println(list.get(3));    //passiing only index
	    
	  }
}