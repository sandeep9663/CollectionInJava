
package com.deep.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Exercises17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		System.out.println(list);

		//list.clear();
		list.removeAll(list);
		
		System.out.println(list);
		
		System.out.println(list.isEmpty());
	}

}
