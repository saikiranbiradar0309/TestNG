package BeforeAndAfterTest;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DealsPage extends BasePage{

	
	
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
}
