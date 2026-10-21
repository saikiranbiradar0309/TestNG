package Annotations_and_Attributes;

import org.testng.annotations.Test;

public class description {
	
	@Test(description = "Login Functionality with valid credentials")
	public void Login()
	{
		System.out.println("This is login page");
	}
}
