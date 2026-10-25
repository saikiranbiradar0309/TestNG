package SauceDemo;


import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class sauceDemo {
	
	
	static WebDriver driver ;
	static WebDriverWait wait;
	
	public static String captureScreenshot() throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		String destinationPath = System.getProperty("user.dir")+"/screenshot/"+System.currentTimeMillis()+".png";
		
		File destionation = new File(destinationPath);
		
		FileUtils.copyFile(source,destionation);
		
		return destinationPath;
	}
	
	
	
	@Test(priority = 1)
	public void chromeUtils()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	
	@Test(dependsOnMethods = "chromeUtils")
	public void login() throws InterruptedException
	{
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@id='user-name']")))
				.sendKeys("standard_user");
		
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//input[@id='password']")))
				.sendKeys("secret_sauce");
		
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//input[@id='login-button']")))
				.click();
		
		Thread.sleep(3000);
	}
	
	
	@Test(dependsOnMethods = "login")
	public void sortProductByPrice() throws InterruptedException
	{
		
		WebElement sortProduct = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		
		Select select = new Select(sortProduct);
		
		select.selectByValue("lohi");
		
		Thread.sleep(3000);
	}
	
	
	
	@Test(dependsOnMethods = "sortProductByPrice")
	public void addJacketToCart() throws InterruptedException
	{
		
		// Lets Intentionally Fails this test case by adding wrong xpath
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//but==ton[@id='add-to-cart-sauce-labs-fleece-jacket']")))
		        .click();
		
		Thread.sleep(3000);
	}
	
	
	
	@Test(dependsOnMethods = "addJacketToCart")
	public void tearDown()
	{
		driver.quit();
	}
}
