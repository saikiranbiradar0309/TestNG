package ExcelAdvanced;


import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Guru99 {
	
	@DataProvider(name = "loadTestData")
	public Object[][] getTestData() throws IOException
	{
		return ExcelReader.readExcelSheetValue("TestData" , "Register");
	}
	
	
	@Test(dataProvider = "loadTestData")
	public void registerTestCases(String fname, String lname, 
			String mobile, String email, String city, String state, String postal)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lname);
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(mobile);
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys(city);
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys(state);
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(postal);
		
		
		
		driver.quit();
	}
}
