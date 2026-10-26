package SauceDemoParallel;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sauceDemo {
	
	private static ThreadLocal<WebDriver> threadLocal = new ThreadLocal<WebDriver>();
	
	public static WebDriver getWebDriverInstance()
	{
		WebDriver driver = new ChromeDriver();
		threadLocal.set(driver);
		
		return threadLocal.get();	
	}
	
	
	@Test
	public void sauceDemoLogin() throws InterruptedException
	{
		WebDriver driver = sauceDemo.getWebDriverInstance();
		
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

