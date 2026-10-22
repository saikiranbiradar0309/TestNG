package Parameters;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo2 {
	
	
	@Parameters({"environment","browser"})
	@Test
	public void testcase1(String environment, String browser)
	{
		System.out.println("The environment is: " + environment);
		System.out.println("The Browser is: " + browser);
		System.out.println("Test Case 1");
	}
	
	
	@Test
	public void testcase2()
	{
		System.out.println("Test Case 2");
	}
}


