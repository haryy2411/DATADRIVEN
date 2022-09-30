package maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelOperation {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\Scandy\\eclipse-workspace\\Framework\\Excel\\Testing.xlsx");

		FileInputStream stream = new FileInputStream(file);

		Workbook excel01 = new XSSFWorkbook(stream);

		Sheet sheet = excel01.getSheet("TestData");
		/*
		  Row row = sheet.getRow(1); 
		  Cell cell = row.getCell(0);
		  System.out.println(cell);
		 */

		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			
			Row row = sheet.getRow(i);
		
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				
				Cell cell = row.getCell(j);
				CellType type = cell.getCellType();
				System.out.println(type);
				
				
				
				
				
				
				
				
				
				
				
				
				/*switch (type) {
				case STRING:
					String value = cell.getStringCellValue();
					System.out.println(value);
					
					break;
				case NUMERIC:
					if (DateUtil.isCellDateFormatted(cell)) {
						Date dateCellValue = cell.getDateCellValue();
						SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yy");
						String format = dateformat.format(dateCellValue);
						System.out.println(format);
						String format = new SimpleDateFormat("dd-MMM-yy").format(cell.getDateCellValue());
					System.out.println(format);
					}
					else {
					double d = cell.getNumericCellValue();
						BigDecimal b = BigDecimal.valueOf(d);
						String s = b.toString();
					System.out.println(s);
					
					String s = new BigDecimal(cell.getNumericCellValue()).toString();
					System.out.println(s);
					}

				default:
					break;
				}*/
				
			}
			
		}

	}

}
