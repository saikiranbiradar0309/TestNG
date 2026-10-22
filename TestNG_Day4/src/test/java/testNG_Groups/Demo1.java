package testNG_Groups;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Demo1 {
	
	
	@Test(groups = {"regression", "e2e", "login"})
	public void testCase1()
	{
		System.out.println("test case 1");
	}
	
	
	@Test(groups = {"e2e", "addContact"})
	public void testCase2()
	{
		System.out.println("test case 2");
	}
	
	
	@Test(groups = {"e2e", "login", "sanity"})
	public void testCase3()
	{
		System.out.println("test case 3");
	}
	
	
	@Test(groups = {"e2e", "addNewDeals", "regression"})
	public void testCase4()
	{
		System.out.println("test case 4");
	}
}
