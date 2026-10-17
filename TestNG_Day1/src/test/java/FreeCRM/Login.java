package FreeCRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Login {
	
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
}
