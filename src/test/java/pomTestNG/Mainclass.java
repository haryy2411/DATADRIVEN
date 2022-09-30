package pomTestNG;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import TestNG.SelectHotelPage;
import maven.ReusableMethod;

public class Mainclass extends ReusableMethod {
	
		@BeforeClass
		public static void beforeclass() {
			getdriver();
			url("https://adactinhotelapp.com/");
			maximize();
		}

		@Parameters({"username", "password"})
		@Test
		private void loginp(String username, String password) {

			LoginPagepom login = new LoginPagepom();
			login.login(username, password);
			

		}
		@Parameters({"location","hotelselect","roomType","roomNo","datepick_in","datepick_out","adult_room","child_room"})
		@Test
		private void searchhotelp(String location,String hotelsselect,String roomType,String roomNo,String datePickin,
				String datePickOut,String adultRoom,String childRoom) {
			Searchhotelpom serach = new Searchhotelpom();
			serach.search(location, hotelsselect, roomType, roomNo, datePickin, datePickOut, adultRoom, childRoom);

		}
		@Test
		private void selectpom() {
			SelectHotelPage sel = new SelectHotelPage();
			sel.tc11();
		}
		

}
