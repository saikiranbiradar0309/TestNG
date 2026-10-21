package BeforeAndAfterTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class BasePage {
	
	static WebDriver driver;
	static WebDriverWait wait;
	
	@BeforeTest
	public void login() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.freecrm.com/login?lang=en");
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
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
		
		System.out.println("Current URL: " + driver.getCurrentUrl());
		System.out.println("Page title: " + driver.getTitle());
		
		Thread.sleep(2000);
	}
}
