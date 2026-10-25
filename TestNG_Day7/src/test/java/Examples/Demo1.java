package Examples;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo1 {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream
				(System.getProperty("user.dir") + "/Sheets/TestData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("Register");
		
		String firstName1 = sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println(firstName1);
		
		String lastName1 = sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println(lastName1);
		
		String phone1 = sheet.getRow(1).getCell(2).getRawValue();
		System.out.println(phone1);
		
		String email1 = sheet.getRow(1).getCell(3).getStringCellValue();
		System.out.println(email1);
		
		String city1 = sheet.getRow(1).getCell(4).getStringCellValue();
		System.out.println(city1);
		
		String state1 = sheet.getRow(1).getCell(5).getStringCellValue();
		System.out.println(state1);
		
		String postal1 = sheet.getRow(1).getCell(6).getRawValue();
		System.out.println(postal1);
		
	}
}
