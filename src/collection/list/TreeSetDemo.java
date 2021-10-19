package collection.list;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Employee e1=new Employee(12,"CCC","A");
		Employee e2=new Employee(10,"BBB","B");
		Employee e3=new Employee(11,"AAA","C");
		
		Set <Object> e= new TreeSet<Object>();
		
		e.add(e3);
		e.add(e1);
		e.add(e2);
		
		System.out.println("Result:"+e);
		
		
	}

}
class Employee implements Comparable
{
	int rollNo;
	String name;
	String collage;
	
	 public Employee(int rollNo,String name,String collage)
	 {
		 this.rollNo=rollNo;
		 this.name=name;
		 this.collage=collage;
	 }

	@Override
	public String toString() {
		return "Employee [rollNo=" + rollNo + ", name=" + name + ",collage=" + collage+"]";
	}
	
	
	
	  public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollage() {
		return collage;
	}

	public void setCollage(String collage) {
		this.collage = collage;
	}

	public int compareTo(Object o)
	  { 
		  Employee e =(Employee) o;
//	  
//	  if(this.getRollNo()==e.getRollNo()) 
//		  return 0;
//	  else if(this.getRollNo()> e.getRollNo())
//		  return 1;
//	  else
//	  
//	  return -1; 
//	 
	// return this.name.compareTo(e.name);
	return this.collage.compareTo(e.collage);
}

	//@Override
	//public int compareTo(Object e) {
		// TODO Auto-generated method stub
		//return 0;
	}
	

