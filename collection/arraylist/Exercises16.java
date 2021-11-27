
//Write a Java program to clone an array list to another array list

package com.deep.collection.arraylist;
import java.util.*;
public class Exercises16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> alist=new ArrayList<>();
			alist.add(2);
			alist.add(3);
			alist.add(1);
			alist.add(5);
			alist.add(6);
			System.out.println(alist);
			
			ArrayList<Integer> list=new ArrayList<>(alist);
			
			list.add(12);
			System.out.println(list);
			
//			ArrayList<Integer> list=(ArrayList<Integer>)alist.clone();
//			
//			list.add(10);
//			System.out.println(list);
			
		
			
		
	}

}
