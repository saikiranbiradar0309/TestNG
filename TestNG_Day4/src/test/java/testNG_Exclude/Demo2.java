package testNG_Exclude;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Demo2 {
	
	@Test(groups = {"e2e", "login", "regression"})
	public void test4()
	{
		System.out.println("Test case 4");
	}
	
	
	@Test(groups = {"e2e", "newDeals"})
	public void test5()
	{
		System.out.println("Test case 5");
	}
	
	
	@Test(groups = {"Sanity", "HR"})
	public void test6()
	{
		System.out.println("Test case 6");
	}
}
