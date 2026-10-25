package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo2 {
	
	@DataProvider(name="registerTestData")
	public Object[][] getTestData()
	{
		Object[][] data = new Object[3][3];
		
		data[0][0] = "Abhishek";
		data[0][1] = "Biradar";
		data[0][2] = "6363636363";
		
		
		data[1][0] = "Tukaram";
		data[1][1] = "Patil";
		data[1][2] = "8383838383";
		
		
		data[2][0] = "Vasanthrao";
		data[2][1] = "Biradar";
		data[2][2] = "9999999999";
		
		
		return data;
	}
	
	
	@Test(dataProvider = "registerTestData")
	public void registerTestCases(String fname, String lname, String mobile)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lname);
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(mobile);
		
		
		driver.quit();
	}
}
