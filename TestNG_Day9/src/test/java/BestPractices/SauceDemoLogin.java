package BestPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SauceDemoLogin {
	
	@Parameters({"browser"})
	@BeforeTest
	public void setUp(String browser)
	{
		Demo1.setDriver(browser);
	}
	
	
	@Test
	public void sauceDemo(String browser) throws InterruptedException
	{
		
		
		
		WebDriver driver = Demo1.getDriver();
		
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
