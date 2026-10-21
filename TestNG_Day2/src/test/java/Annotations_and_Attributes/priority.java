package Annotations_and_Attributes;

import org.testng.annotations.Test;

public class priority {
	
	
	// If we don't specify Priority, Default priority will be 0
	@Test
	public void Case1()
	{
		System.out.println("Test Case 1");
	}
	
	@Test(priority = 1)
	public void Case2()
	{
		System.out.println("Test Case 2");
	}
	
	
	@Test(priority = 2)
	public void Case3()
	{
		System.out.println("Test Case 3");
	}
	
	
	// If we specify Negative Priority The negative one will be executed First
	@Test(priority = -1)
	public void Case4()
	{
		System.out.println("Test Case 4");
	}
}
