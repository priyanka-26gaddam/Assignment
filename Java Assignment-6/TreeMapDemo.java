package com.java.collections;
import java.util.*;
import java.util.Set;
import java.util.TreeMap;
class contact{
int phnum;
String Name;
String Email;
String Gender;
public contact(int phnum,String name,String email,String gender) {
	this.phnum=phnum;
	this.Name=name;
	this.Email=email;
	this.Gender=gender;
	}
public String toString() {
	return this.phnum +" "+this.Name +" "+this.Email+" "+this.Gender;
	}
}
class Sortbyphnum implements Comparator<contact>{
	public int compare(contact a,contact b) {
	return b.phnum-a.phnum;
}
}

public class TreeMapDemo {
	static void main() {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<contact,Integer> treeMap= new TreeMap<contact,Integer>(new Sortbyphnum());
		treeMap.put(new contact(1234567, "priya","priya@gmail.com","female"),3);
		treeMap.put(new contact(4567890, "chintu","chintu@gmail.com","male"),4);
		treeMap.put(new contact(876543118, "shiva","shiva@gmail.com","male"),2);
		treeMap.put(new contact(56789076, "jillu","jillu@gmail.com","female"),1);
		System.out.println("treeMap : " + treeMap + "\n");
		//a.fetch all keys and print them
		Set<contact> set= treeMap.keySet();
		
		for(contact key:set) {
			System.out.println(key);
		}
		//b.fetch all values and print them
		System.out.println("fetching all values:"+treeMap.values());
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//c.print all key-value pairs
			System.out.println("treeMap using");
			main();
			
		}

	}


