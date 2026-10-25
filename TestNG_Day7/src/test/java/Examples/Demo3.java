package Examples;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo3 {
	
	@DataProvider(name = "loadTestData")
	public Object[][] getTestData() throws IOException
	{
		Object[][] data = new Object[4][7];
		
		FileInputStream fis = 
				new FileInputStream(System.getProperty("user.dir") + "/Sheets/TestData.xlsx");
	
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("Register");
		
		data[0][0] = sheet.getRow(0).getCell(0).getStringCellValue();
		data[0][1] = sheet.getRow(0).getCell(1).getStringCellValue();
		data[0][2] = sheet.getRow(0).getCell(2).getRawValue();
		data[0][3] = sheet.getRow(0).getCell(3).getStringCellValue();
		data[0][4] = sheet.getRow(0).getCell(4).getStringCellValue();
		data[0][5] = sheet.getRow(0).getCell(5).getStringCellValue();
		data[0][6] = sheet.getRow(0).getCell(6).getRawValue();
		
		
		data[1][0] = sheet.getRow(1).getCell(0).getStringCellValue();
		data[1][1] = sheet.getRow(1).getCell(1).getStringCellValue();
		data[1][2] = sheet.getRow(1).getCell(2).getRawValue();
		data[1][3] = sheet.getRow(1).getCell(3).getStringCellValue();
		data[1][4] = sheet.getRow(1).getCell(4).getStringCellValue();
		data[1][5] = sheet.getRow(1).getCell(5).getStringCellValue();
		data[1][6] = sheet.getRow(1).getCell(6).getRawValue();
		
		data[2][0] = sheet.getRow(2).getCell(0).getStringCellValue();
		data[2][1] = sheet.getRow(2).getCell(1).getStringCellValue();
		data[2][2] = sheet.getRow(2).getCell(2).getRawValue();
		data[2][3] = sheet.getRow(2).getCell(3).getStringCellValue();
		data[2][4] = sheet.getRow(2).getCell(4).getStringCellValue();
		data[2][5] = sheet.getRow(2).getCell(5).getStringCellValue();
		data[2][6] = sheet.getRow(2).getCell(6).getRawValue();
		
		data[3][0] = sheet.getRow(3).getCell(0).getStringCellValue();
		data[3][1] = sheet.getRow(3).getCell(1).getStringCellValue();
		data[3][2] = sheet.getRow(3).getCell(2).getRawValue();
		data[3][3] = sheet.getRow(3).getCell(3).getStringCellValue();
		data[3][4] = sheet.getRow(3).getCell(4).getStringCellValue();
		data[3][5] = sheet.getRow(3).getCell(5).getStringCellValue();
		data[3][6] = sheet.getRow(3).getCell(6).getRawValue();
		
		return data;
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
