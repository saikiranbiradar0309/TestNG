package Annotations_and_Attributes;

import org.testng.annotations.Test;

public class threadPoolSize {
	
	@Test
	public void Test1()
	{
		System.out.println("Test Case 1");
	}
	
	@Test(priority = 1, invocationCount = 2, invocationTimeOut = 5000, threadPoolSize = 2)
	public void Test2()
	{
		System.out.println("Test Case 2");
	}
	
	@Test(priority = 2)
	public void Test3()
	{
		System.out.println("Test Case 3");
	}
}
