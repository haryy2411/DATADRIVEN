package maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.WorkbookUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileInput {

	public static void main(String[] args) throws IOException {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		File file = new File("C:\\Users\\Scandy\\eclipse-workspace\\Framework\\Excel\\TestData.xlsx");

		Workbook workbook = new XSSFWorkbook();
		
		Sheet sheet = workbook.createSheet("Test");
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement select = driver.findElement(By.id("Skills"));
		
		Select sl = new Select(select);
		List<WebElement> options = sl.getOptions();
		int size = options.size();
		
		int a=0;
		
		for (WebElement x : options) {
			String text = x.getText();
			Row row = sheet.createRow(a);
			Cell cell = row.createCell(0);
			
			cell.setCellValue(text);
			a++;
						
		}
		FileOutputStream out = new FileOutputStream(file);
		
		workbook.write(out);
		
		}
		
		
	}


