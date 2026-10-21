package BeforeAndAfterTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class TearDown  extends BasePage{
	
	
	@AfterTest
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
