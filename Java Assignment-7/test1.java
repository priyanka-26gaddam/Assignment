package com.annotation;

import java.lang.annotation.*;  
import java.lang.reflect.*;  

@Retention (RetentionPolicy.RUNTIME)  
@Target (ElementType.METHOD)  
@interface Test
{  
	String str();  
}  

class first {
	@Test(str="Test Annotation")  
	public void testCase() {}  

}
public class test1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		first f=new first();  
		Method m = f.getClass().getMethod("testCase");  
	
		Test ts = m.getAnnotation(Test.class);  
		System.out.println(ts.str());  

	}

}