
//Write a Java program to remove the third element from a array list.
package com.deep.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Exercises6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List ls = new ArrayList();

		ls.add("a");
		ls.add("b");
		ls.add("c");
		ls.add("d");
		ls.add("e");
		ls.add("f");
		
		System.out.println("result:"+ls);
	ls.remove(2);
	System.out.println("update list:"+ls);
}
}