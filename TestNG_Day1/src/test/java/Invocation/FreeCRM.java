package Invocation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class FreeCRM {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@Test(priority = 1)
	public void openWebsite()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://ui.freecrm.com/login");
	}
	
	
	@Test(priority = 2)
	public void enterCredentials()
	{
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@id='email']")))
				.sendKeys("biradarsaikiran4@gmail.com");
		
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@id='password']")))
				.sendKeys("8050@#Sai");
		
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//button[@type='submit']")))
				.click();
	}
	
	
	// invocationCount attribute used to execute same cases multiple times
	// invocationTimeout attribute used to execute all invocationCount test cases within the time
	// threadPoolSize is nothing but execute invocationCount test cases parallely.
	
	
	//@Test(priority = 3, invocationCount = 5, invocationTimeOut = 5000, threadPoolSize = 2)
	
	@Test(priority = 3, invocationCount = 5, invocationTimeOut = 5000)
	public void createTask()
	{
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[@href='/tasks']")))
				.click();
		
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("(//button[normalize-space()='Create'])[1]")))
				.click();
		
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@id='title']")))
		 		.sendKeys("Java");
		
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//button[@type='submit']")))
				.click();
		
		
	}
	
}
