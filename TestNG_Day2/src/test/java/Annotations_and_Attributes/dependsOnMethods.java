package Annotations_and_Attributes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsOnMethods {
	
	
	@Test
	public void login()
	{
		Assert.assertEquals(12, 120);
		
		// When I have added Assertion as 12 is not equal to 120, The login test case will fail
		
		// And Both home and addNewContact Depends on each other so obviously they will also fail
		
		System.out.println("This is login page");
	}
	
	
	
	// To make sure the test case runs even if the login test case fails 
	// We can add alwaysRun =  true
	
	// Now Both home and addNewContact test cases will be successfully executed 
	// and login test case marked as Failed
	
	@Test(dependsOnMethods = "login", alwaysRun = true)
	public void home()
	{
		System.out.println("This is home page");
	}
	
	@Test(dependsOnMethods = "home")
	public void addNewContact()
	{
		System.out.println("New Contact added successfully");
	}
}
