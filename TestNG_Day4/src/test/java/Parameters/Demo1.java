package Parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo1 {

	@Parameters({"browser"})
	@Test
	public void testCase1(String browser)
	{
		System.out.println("Executing on browser: " + browser);
		System.out.println("Test case 5");
	}
}
