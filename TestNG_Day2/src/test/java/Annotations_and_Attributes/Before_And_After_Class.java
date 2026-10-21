package Annotations_and_Attributes;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Before_And_After_Class {
	
	
	// Before class will be executed only once 
	// If we have 100 test cases in our class it will be executed only one time
	@BeforeClass
	public void login()
	{
		System.out.println("This is login page");
	}
	
	
	@Test
	public void home()
	{
		System.out.println("This is home page");
	}
	
	@Test
	public void messages()
	{
		System.out.println("This is messages page");
	}
	
	
	// After class will be executed only once 
	// If we have 100 test cases in our class it will be executed only one time
	
	@AfterClass
	public void logout()
	{
		System.out.println("This is logout page");
	}
}
