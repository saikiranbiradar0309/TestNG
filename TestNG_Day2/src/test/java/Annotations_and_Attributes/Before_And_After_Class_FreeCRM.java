package Annotations_and_Attributes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Before_And_After_Class_FreeCRM {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void login() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.freecrm.com/login?lang=en");
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@id='email']")))
				.sendKeys("prafulp1010@gmail.com");
		
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@id='password']")))
				.sendKeys("Pr@ful0812");
		
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//button[@type='submit']")))
				.click();
		
		Thread.sleep(2000);
	}
	
	
	@Test
	public void addNewDeals() throws InterruptedException
	{
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[@href='/deals']//span[text()='Deals']")))
				.click();
		
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//button[text()='Create']")))
				.click();
		
		
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@id='title']")))
				.sendKeys("MacBook Air M5");
		
		
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//button[@type='submit']")))
				.click();
		
		Thread.sleep(3000);
		
	}
	
	
	@Test
	public void addNewContacts() throws InterruptedException
	{
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[@href='/contacts']")))
				.click();
		
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//button[text()='Create']")))
				.click();
		
		
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@id='first-name']")))
				.sendKeys("Saikiran");
		
		
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@id='last-name']")))
				.sendKeys("Biradar");
		
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//button[@type='submit']")))
				.click();
		
		Thread.sleep(3000);
	}
	
	
	
	@Test
	public void addNewTasks() throws InterruptedException
	{
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[@href='/tasks']")))
				.click();
		
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//button[text()='Create']")))
				.click();
		
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@id='title']")))
				.sendKeys("TestNG");
		
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//button[@type='submit']")))
				.click();
		
		Thread.sleep(3000);
	}
	
	
	@AfterClass
	public void logout() throws InterruptedException
	{
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//button[@aria-label='User menu']")))
				.click();
		
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//button[text()='Log Out']")))
				.click();
		
		Thread.sleep(2000);
		
		driver.quit();
	}
	
	
}
