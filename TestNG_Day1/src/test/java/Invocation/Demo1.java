package Invocation;

import org.testng.annotations.Test;

public class Demo1 {
	
	
	@Test
	public void Login()
	{
		System.out.println("User has Logged In");
	}
	
	
	// invocationCount attribute used to execute same cases multiple times
	// invocationTimeout attribute used to execute all invocationCount test cases within the time
	// threadPoolSize is nothing but execute invocationCount test cases parallely.

	@Test(priority = 1, invocationCount = 5, invocationTimeOut = 10, threadPoolSize = 2)
	public void addContact()
	{
		System.out.println("Contact1 Added");
		System.out.println("Contact2 Added");
		System.out.println("Contact3 Added");
	}
	
	@Test(priority = 2)
	public void Logout()
	{
		System.out.println("User has Logged Out");
	}
}
