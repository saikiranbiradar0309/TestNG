package RetryAnalyzer;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 {
	
	
	@Test(priority = 1)
	public void test1()
	{
		System.out.println("Test Case 1 Started");
		AssertJUnit.assertEquals(101, 101);
		System.out.println("Test Case 1 Executed");
	}
	
	
	@Test(priority = 2, retryAnalyzer = Retry.class)
	public void test2()
	{
		System.out.println("Test Case 2 Started");
		AssertJUnit.assertEquals(101, 1121);
		System.out.println("Test Case 2 Executed");
	}
	
	
	@Test(priority = 3)
	public void test3()
	{
		System.out.println("Test Case 3 Started");
		AssertJUnit.assertEquals("Sai", "sai");
		System.out.println("Test Case 3 Executed");
	}
	
}
