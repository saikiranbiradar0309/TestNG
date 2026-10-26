package BrowserParallelExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo1 {
	
	private static ThreadLocal<WebDriver> threadLocal = new ThreadLocal<WebDriver>();
	
	public static WebDriver getDriverInstance(String browser)
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
		
		return threadLocal.get();
	}
	
	
	
	@Parameters({"browser"})
	@Test
	public void sauceDemoLogin(String browser) throws InterruptedException
	{
		WebDriver driver = Demo1.getDriverInstance(browser);
		
		driver.get("https://www.saucedemo.com/");
		
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		Thread.sleep(3000);
		driver.findElement(By.id("login-button")).click();
		
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}
}
