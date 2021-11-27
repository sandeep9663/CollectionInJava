
//Write a Java program to update specific array element by given element
package com.deep.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Exercises5 {

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
		
		ls.set(0,"x");
		ls.set(1, "f");
		System.out.println(ls);
	}

}
