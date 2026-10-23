package SoftAssert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo1 {
	
	
	// Here SoftAssert wont throw any error it will execute test case and 
	// Mark it as Passes
	@Test
	public void test1()
	{
		System.out.println("Test Case 1");
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(101, 102);
		System.out.println("Test Case 1 After Soft Assert");
		
	}
	
	
	// Here SoftAssert will throw error Because we used assertAll()
	@Test(priority = 1)
	public void test2()
	{
		System.out.println("Test Case 2");
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(101, 102);
		soft.assertAll();
		System.out.println("Test Case 2 After Soft Assert");
		
	}
}
