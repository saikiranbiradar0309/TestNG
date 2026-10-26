package BestPractices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {
	
	private static ThreadLocal<WebDriver> threadLocal = new ThreadLocal<WebDriver>();
	
	public static void setDriver(String browser)
	{
		if(browser.equals("chrome"))
		{
			WebDriver driver = new ChromeDriver();
			threadLocal.set(driver);
		}
		
		else if(browser.equals("firefox"))
		{
			WebDriver driver = new FirefoxDriver();
			threadLocal.set(driver);
		}
		
		else if(browser.equals("edge"))
		{
			WebDriver driver = new EdgeDriver();
			threadLocal.set(driver);
		}
		
		else
		{
			System.out.println("Invalid Browser");
		}
		
		
	}
	
	
	public static WebDriver getDriver()
	{
		return threadLocal.get();
	}
}
