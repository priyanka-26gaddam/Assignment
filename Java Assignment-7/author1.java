package com.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
//import java.lang.annotation.Target;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@interface info{
	String id();
	String name();
	String superviser();
	String date();
	String time();
	String version();
	
}
class author{
	@info(id=" 12",name="priya ",superviser="shilpa ",date=" 19-01-2022",time = "12:12 ", version = " 1.8")
	public void display() {
	
	}
	
}

public class author1 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		author a = new author(); 
		a.display();  
		   Method m = a.getClass().getMethod("display"); 
		info i = m.getAnnotation(info.class);
		
		System.out.println("Author ID : " +i.id());
		System.out.println("Author Name: " +i.name());
		System.out.println("Superviser Name: " +i.superviser());
		System.out.println("Date: " +i.date());
		System.out.println("Time: " +i.time());
		System.out.println("Version: " +i.version());

	}

}