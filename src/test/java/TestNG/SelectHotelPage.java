package TestNG;

import org.testng.annotations.Test;

import maven.ReusableMethod;

public class SelectHotelPage extends ReusableMethod {
	
	
	@Test
	public void tc11() {
		findElementById("radiobutton_0").click();
		findElementById("continue").click();
	}

}
