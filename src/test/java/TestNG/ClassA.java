package TestNG;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import maven.ReusableMethod;

public class ClassA extends ReusableMethod {


	@BeforeClass
	public static void beforeclass() {
		getdriver();
		url("https://www.facebook.com/");
		maximize();
	}
	
	@AfterClass
	public static void after() {
		quit();

	}
	
	@Parameters({"username","password"})
	@Test
	private void tc01(String s, String s1) {
	findElementById("email").sendKeys(s);
	findElementById("pass").sendKeys(s1);
	WebElement name = name("login");
	Click(name);
	}
}