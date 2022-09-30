package com.blazeflight;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BlazeFlight extends ReusableMethod{
	
	@BeforeClass
	public void beforeclass1() throws IOException {
	
		getdriver();
		String url = getpropertyfilevalue("url");
		url(url);
		implicitwait();
		
		
	}
	@Test(priority=1)
	public void TC01() throws IOException {
		WebElement name = name("fromPort");
		selectVisible(name, getpropertyfilevalue("from"));
		WebElement to = name("toPort");
		selectVisible(to, getpropertyfilevalue("to"));
		WebElement click = xpath("//input[@type='submit']");
		Click(click);
	}
	@Test(priority=2)
	public void tc02() {
		WebElement search = xpath("(//input[@type='submit'])[3]");
		Click(search);
	}
	@Parameters({"txtUsername", "txtaddress", "city", "state", "zipCode", "cardType", "creditCardNumber", 
		"creditCardMonth", "creditCardYear", "nameOnCard"})
	@Test(priority=3)
	public void tc03(String txtUsername, String txtaddress, String city, String state, String zipCode, String cardType,
			String creditCardNumber, String creditCardMonth, String creditCardYear, String nameOnCard) throws IOException {
		DetailsPOM details = new DetailsPOM();
		details.details(txtUsername, txtaddress, city, state, zipCode, cardType, creditCardNumber, 
				creditCardMonth, creditCardYear, nameOnCard);
		WebElement xpath1 = xpath("//tr[1]//td[2]");//td[normalize-space()='Id']//following::td[1]
		String text = getText(xpath1);
		//String value = attributeValue(xpath1, "value");
		System.out.println(text);
		insertdata("sheet02", 1, 19, text);
	}
	
}
