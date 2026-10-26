package Parallel;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Demo2 {
	
	@Test
	public void testCase2()
	{
		WebDriver driver = Demo1.getInstance();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	
	
}
