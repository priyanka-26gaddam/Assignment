package com.java.collections;
import java.util.*;
class Employee implements Comparable<Employee>{
int id;
String Name;
String Department;
int Salary;
 public Employee(int id,String name,String department,int salary) {
	 this.id=id;
	 this.Name=name;
	 this.Department=department;
	 this.Salary=salary;
	 }
 public int compareTo(Employee e) {
	 if(id>e.id) {
		 return 1;
	 }
	 else if(id<e.id)
	 {
		 return -1;
	 }
	 else {
		 return 0;
	 }
 }
}

public class TreeSetEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <Employee>set=new TreeSet<Employee>();
	   Employee e1=new Employee(1,"priya","software",30000);
	   Employee e2=new Employee(2,"chintu","developer",35000);
	   Employee e3=new Employee(3,"jillu","analyst",20000);
	   Employee e4=new Employee(4,"priya","software",30000);
	   Employee e5=new Employee(5,"shiva","programer",35000);
	   Employee e6=new Employee(6,"riya","engineer",25000);
	   Employee e7=new Employee(7,"bharu","manager",45000);
	   Employee e8=new Employee(8,"chinni","system analyst",35000);
	   Employee e9=new Employee(9,"raju","programer",35000);
	   Employee e10=new Employee(10,"rithu","qa analyst",45000);
	   

	   set.add(e1);
	   set.add(e2);
	   set.add(e3);
	   set.add(e4);
	   set.add(e5);
	   set.add(e6);
	   set.add(e7);
	   set.add(e8);
	   set.add(e9);
	   set.add(e10);
	   
	   
	   for(Employee e:set) {
		   System.out.println("Sorted by name:"+e.Name);
	   }
	}

}
