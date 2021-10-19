package collection.list;

//import java.lang.reflect.Field;

import java.util.ArrayList;

//import java.util.Iterator;
import java.util.ListIterator;
//import java.util.List;


public class ArrayListDemo {
	
	public static void main(String[] args) throws Exception 
	{

		
		
	/*	
		  String[] strArray = {"Object","Array","Converted","To","List"};
		System.out.println(strArray);
		
		  List list = Arrays.asList(strArray);
		
		
		  Iterator itr = list.iterator();
		
		
		  System.out.println("List created from an Array of type Object contains,");
		    while(itr.hasNext())
		      System.out.println(itr.next());
		   
		  }
*/

		
		
		
		
		
		
		
		
		
		
		
		
			
	  ArrayList<Object> al=new ArrayList<>(); 
			  Student s1 =new Student(10,"xyz");			  
		  al.add("sandeep"); 
			  al.add("patil");
			  al.add("abc"); 
			  al.add(123); 
			  al.add(s1);
				 System.out.println(al);
			  al.remove("patil");
			 al.remove(al);
			  System.out.println(al);
				Object a1=al.subList(0, 2);
				
				 System.out.println(a1);
			 
			  System.out.println( al.subList(0, 2));;
			  
				System.out.println(al.indexOf("avc"));
				System.out.println(al.lastIndexOf(123));
			  System.out.println(al.get(2));
			  System.out.println(al.contains("sandeep"));
			   System.out.println(al.containsAll(al));
			  
			  //System.out.println(al.containsAll(al)); 
			   System.out.println(al.isEmpty());
			  System.out.println(al.size()); 
			  System.out.println(al.equals(al));
			 
			  //System.out.println(al.iterator()); 
			//  Iterator<Object> itr =al.iterator();
			  //define the iterator
			  ListIterator<Object> it1 =al.listIterator();
			  while(it1.hasNext())
			  { 
				  System.out.println(it1.next());
				  al.add("ram");
			  }
			  
	
			  
			  for(Object o : al) { System.out.println(o); }
			  
			  
			  for(int i=0;i<al.size();i++)
			  {
				  System.out.println(al.get(i)); 
				  }
			  }
			  
			 
		

	
				/*
				 * System.out.println(al); System.out.println("size:"+al.size());
				 * 
				 * ArrayList<Object> al2 =new ArrayList<>();
				 * 
				 * al2.add("abc"); al2.add(s1); al2.addAll(al); al2.removeAll(al);
				 * 
				 * //al.clear(); //al2.clear(); al.retainAll(al2); //except current collection.
				 * al
				 * 
				 * System.out.println(al2.equals(al)); System.out.println(al2);
				 * System.out.println("size:"+al2.size());
				 */
		

	@Override
	public String toString() {
		return "ArrayListDemo []";
}

}
 

 class Student
 {
	 int rollNo;
	 String name;
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	public void addAll() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
	
	
	
	
	
	
	
	
 }