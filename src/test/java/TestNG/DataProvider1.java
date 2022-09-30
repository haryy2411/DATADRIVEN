package TestNG;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import maven.ReusableMethod;

public class DataProvider1 extends ReusableMethod{

	@Test
	public Object datafromexcel(int rowNo, int cellNo) throws IOException {

		return Getsheet("flipkart", rowNo, cellNo);		
	}


	@DataProvider
	public Object[][] getdata() throws IOException{
		return new Object[][] {{datafromexcel(0, 0)},{datafromexcel(1, 0)},{datafromexcel(2, 0)},
			{datafromexcel(3, 0)},{datafromexcel(4, 0)}};
	}

	@Test(dataProvider= "getdata")
	private void tc01(String s) throws InterruptedException {
		getdriver();
		url("https://www.flipkart.com/");
		maximize();

		xpath("(//button)[2]").click();
		WebElement name = name("q");
		enterText(name, s);

	}



}
