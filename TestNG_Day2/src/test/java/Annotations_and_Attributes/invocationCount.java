package Annotations_and_Attributes;

import org.testng.annotations.Test;

public class invocationCount {
	
	@Test
	public void test1()
	{
		System.out.println("Test Case 1");
	}
	
	
	// test2 will be executed 2 times because of invocationCount = 2
	@Test(priority = 1, invocationCount = 2)
	public void test2()
	{
		System.out.println("Test Case 2");
	}
	
	@Test(priority = 2)
	public void test3()
	{
		System.out.println("Test Case 3");
	}
}
