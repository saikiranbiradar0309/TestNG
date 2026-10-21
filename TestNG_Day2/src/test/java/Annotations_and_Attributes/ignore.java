package Annotations_and_Attributes;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ignore {
	
	@Test
	public void case1()
	{
		System.out.println("Test Case 1");
	}
	
	@Test(priority = 1)
	public void case2()
	{
		System.out.println("Test Case 2");
	}
	
	
	// If we specify @Ignore, then this test case will be ignored
	@Ignore
	public void case3()
	{
		System.out.println("Test Case 3");
	}
}
