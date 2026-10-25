package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo1 {
	
	@DataProvider(name = "loadTestData")
	public Object[][] getTestData() throws IOException
	{
		FileInputStream fis = new FileInputStream
				(System.getProperty("user.dir") + "/Sheets/TestData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("Register");
		
		int totalRows = sheet.getLastRowNum()+1;
		int totalCells = sheet.getRow(0).getLastCellNum();
		
		Object[][] data = new Object[totalRows][totalCells];
		
		
		for(int i=0; i<totalRows; i++)
		{
			for(int j=0; j<totalCells; j++)
			{
				XSSFCell cells = sheet.getRow(i).getCell(j);
				
				if(cells.getCellType() == CellType.STRING)
				{
					data[i][j] = cells.getStringCellValue();
				}
				
				else if(cells.getCellType() == CellType.NUMERIC)
				{
					data[i][j] = cells.getRawValue();
				}
				
				else
				{
					System.out.println("Invalid Data Type");
				}
			}
		}
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
