package testNG_Exclude;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Demo1 {

	
	@Test(groups = {"e2e", "login", "regression"})
	public void test1()
	{
		System.out.println("Test case 1");
	}
	
	
	@Test(groups = {"e2e", "regression"})
	public void test2()
	{
		System.out.println("Test case 2");
	}
	
	
	@Test(groups = {"Sanity", "addNewContact", "e2e"})
	public void test3()
	{
		System.out.println("Test case 3");
	}
}
