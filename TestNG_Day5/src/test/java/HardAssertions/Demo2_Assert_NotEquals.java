package HardAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo2_Assert_NotEquals {
	
	
	@Test(priority=1)
	public void test1()
	{
		System.out.println("Test Case 1");
		Assert.assertNotEquals(101, 101);
		System.out.println("Assert Not Equals Test Case 1");
	}
	
	
	@Test(priority=2)
	public void test2()
	{
		System.out.println("Test Case 2");
		Assert.assertNotEquals(101, 102);
		System.out.println("Assert Not Equals Test Case 2");
	}
}
