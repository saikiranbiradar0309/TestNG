package Annotations_and_Attributes;

import org.testng.annotations.Test;

public class enabled {
	
	@Test
	public void test1()
	{
		System.out.println("Test Case 1");
	}
	
	@Test(priority = 1)
	public void test2()
	{
		System.out.println("Test Case 2");
	}
	
	// If we specify enabled = false, then this test case will be ignored
	@Test(enabled = false)
	public void test3()
	{
		System.out.println("Test Case 3");
	}
}
