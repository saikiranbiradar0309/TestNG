package Parallel;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {
	
	private static ThreadLocal<WebDriver> threadLocal = new ThreadLocal<WebDriver>();
	
	public static WebDriver getInstance()
	{
		WebDriver driver = new ChromeDriver();
		
		threadLocal.set(driver);
		
		return threadLocal.get();
		
	}
	
	
	@Test
	public void testCase1()
	{
		WebDriver driver = Demo1.getInstance();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);
	}
}
