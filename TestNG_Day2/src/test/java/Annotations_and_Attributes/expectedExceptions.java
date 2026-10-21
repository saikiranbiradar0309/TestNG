package Annotations_and_Attributes;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class expectedExceptions {
	
	@Test(description = "This is Exception Test Case", expectedExceptions = NullPointerException.class )
	public void abc()
	{
		String name = null;
		
		String a = name.toUpperCase();
		
		System.out.println(a);
	}
	
	
	@Test(priority=1, expectedExceptions = NoSuchElementException.class)
	public void google()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		// Lets find a element which doesnt exists
		driver.findElement(By.id("abc")).click();
		
		
		// If you run above test without expectedExceptions it will fail
		// You wull get NoSuchElementException error
		
		
	}
}
