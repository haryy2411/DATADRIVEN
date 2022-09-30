package TestNG;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import maven.ReusableMethod;

public class LoginPage extends ReusableMethod{


	@BeforeClass
	public static void beforeclass() {
		getdriver();
		url("https://adactinhotelapp.com/");
		maximize();
	}
	@Parameters({"username","password"})
	@Test
	private void tc02(String s, String s1) {
		findElementById("username").sendKeys(s);
		findElementById("password").sendKeys(s1);
		findElementById("login").click();


	}
	@Parameters({"location","hotelselect","roomType","roomNo","datepick_in","datepick_out","adult_room","child_room"})
	@Test
	private void tc03(String location, String hotelsselect, String roomType, 
			String roomNo, String datePickin, String datePickOut, String adultRoom,
			String childRoom) {
		WebElement locate = findElementById("location");
		selectVisible(locate, location);
		WebElement selecthotel = findElementById("hotels");
		selectVisible(selecthotel, hotelsselect);
		WebElement roomtype = findElementById("room_type");
		selectVisible(roomtype, roomType);
		WebElement roomnum = findElementById("room_nos");
		selectVisible(roomnum, roomNo);
		WebElement datein = findElementById("datepick_in");
		datein.clear();
		datein.sendKeys(datePickin);
		WebElement dateout = findElementById("datepick_out");
		dateout.clear();
		dateout.sendKeys(datePickOut);
		WebElement adult = findElementById("adult_room");
		selectVisible(adult, adultRoom);
		WebElement child = findElementById("child_room");
		selectVisible(child, childRoom);
		WebElement clicksubmit = findElementById("Submit");
		Click(clicksubmit);
	}

}
