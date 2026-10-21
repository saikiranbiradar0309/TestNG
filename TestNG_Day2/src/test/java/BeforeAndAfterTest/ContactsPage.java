package BeforeAndAfterTest;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ContactsPage extends BasePage{
	
	
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
}
