package ExcelAdvanced;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	// Lets Say I have multiple Excel FIles
	public static Object[][] readExcelSheetValue(String fileName, String sheetName) throws IOException
	{
		
		String filePath = System.getProperty("user.dir")+"/sheets/"+fileName+".xlsx";
		
		
		FileInputStream fis = new FileInputStream(filePath);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet(sheetName);
		
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
}
