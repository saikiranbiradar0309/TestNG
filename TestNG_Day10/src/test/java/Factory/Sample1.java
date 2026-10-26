package Factory;

import org.testng.annotations.Test;

public class Sample1 {
	
	@Test(priority = 1)
	public void login()
	{
		System.out.println("login TC");
	}
	
	
	@Test(priority = 2)
	public void home()
	{
		System.out.println("Home TC");
	}
}
