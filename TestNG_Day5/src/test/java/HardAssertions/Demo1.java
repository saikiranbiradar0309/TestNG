package HardAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 {
	
	
	
	// If both the values are equal it wont throw error
	@Test(priority = 1)
	public void testcase1()
	{
		System.out.println("Test Case 1");
		Assert.assertEquals(101, 101);
		System.out.println("Assertion of Test Case 1");
		
	}
	
	
	// If both the values are not equal it will throw error
	@Test(priority = 2)
	public void testcase2()
	{
		System.out.println("Test Case 2");
		Assert.assertEquals(101, 102);
		System.out.println("Assertion of Test Case 2");
		
	}
	
	
	@Test(priority = 3)
	public void testcase3()
	{
		System.out.println("Test Case 3");
		Assert.assertEquals("Saikiran", "saikiran");
		System.out.println("Assertion of Test Case 3");
		
	}
	
	
	@Test(priority = 4)
	public void testcase4()
	{
		System.out.println("Test Case 4");
		Assert.assertEquals("Saikiran", "Saikiran");
		System.out.println("Assertion of Test Case 4");
		
	}
}
