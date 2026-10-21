package Annotations_and_Attributes;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Before_And_After_Methods {

	// Before method executes before the test
	
	@BeforeMethod
	public void login()
	{
		System.out.println("This is login page");
	}
	
	@Test
	public void home()
	{
		System.out.println("This is home page");
	}
	
	// Flow
	// Login, Home, Logout
	
	
	@Test
	public void messages()
	{
		System.out.println("This is messages page");
	}
	
	// Flow
	// Login, Home, Logout
	// Login, Messages, Logout
	
	
	
	// After method executes after the test
	
	@AfterMethod
	public void logout()
	{
		System.out.println("This is logout page");
		System.out.println("---------------------------------------------");
	}
	
	
	
}
