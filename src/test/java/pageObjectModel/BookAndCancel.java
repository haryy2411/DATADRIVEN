package pageObjectModel;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import maven.ReusableMethod;

public class BookAndCancel extends ReusableMethod {
	@BeforeClass
	public static void beforeclass() {
		getdriver();
		url("https://adactinhotelapp.com/");
		maximize();
	}

	@AfterClass
	public static void afterClass() {
		
		quit();
	}
	
	@Test
	public void HotelSearch() throws IOException {
		LoginPage login01 = new LoginPage();
		login01.login(Getsheet("TestExcel", 1, 0), Getsheet("TestExcel", 1, 1));
		
		SearchHotel search01 = new SearchHotel();
		search01.search(Getsheet("sheet02", 1, 2), Getsheet("sheet02", 1, 3), 
				Getsheet("sheet02", 1, 4), Getsheet("sheet02", 1, 5), Getsheet("sheet02", 1, 8),
				Getsheet("sheet02", 1, 9), Getsheet("sheet02", 1, 6), Getsheet("sheet02", 1, 7));
		
		SelectHotel sel = new SelectHotel();
		sel.select();
	
		BookHotel book01 = new BookHotel();
		book01.BookPage(Getsheet("sheet02", 1, 10), Getsheet("sheet02", 1, 11), Getsheet("sheet02", 1, 12),
				Getsheet("sheet02", 1, 13), Getsheet("sheet02", 1, 14),Getsheet("sheet02", 1, 15) , 
				Getsheet("sheet02", 1, 16), Getsheet("sheet02", 1, 17));
		
		Orderid id = new Orderid();
		id.orderIdno();

		CancelBooking cancel = new CancelBooking();
		threadwait();
		cancel.bookingcancel(Getsheet("sheet02", 1, 18));
	}
	
	
	
	
}
