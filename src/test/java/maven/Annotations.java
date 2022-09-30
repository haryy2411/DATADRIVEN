package maven;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.net.URL;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Annotations extends ReusableMethod {
	
	@BeforeClass
	public static void before() {
		
		
		getdriver();
		url("https://adactinhotelapp.com/index.php");
		maximize();
	}
		@AfterClass
		public static void afterclass() {
			
			quit();
		}
		
		

		@Test
		public  void testmeth() throws IOException, InterruptedException  {
			WebElement txtuser = findElementById("username");
			String getsheet = Getsheet("TestExcel", 1, 0);
			enterText(txtuser, getsheet);

			WebElement txtpassword = findElementById("password");
			String sheet2 = Getsheet("TestExcel", 1, 1);
			enterText(txtpassword, sheet2);

			WebElement btnlogin = findElementById("login");
			Click(btnlogin);
			Thread.sleep(2000);
			WebElement username = findElementById("username_show");
			String usertxt = username.getAttribute("value");
			System.out.println(usertxt);
			Assert.assertEquals("Verify username: ", "Hello luciferdevil786!", usertxt);
			boolean than = usertxt.contains("Hello luciferdevil786!");
			Assert.assertTrue(than);
			System.out.println(than);

			WebElement sel = findElementById("location");
			String loca = Getsheet("sheet02", 1, 2);
			selectVisible(sel, loca);

			WebElement location = findElementById("hotels");
			String hotel = Getsheet("sheet02", 1, 3);
			selectVisible(location, hotel);

			WebElement room = findElementById("room_type");
			String roomtype = Getsheet("sheet02", 1, 4);
			selectVisible(room, roomtype);

			WebElement date = findElementById("datepick_in");
			clear(date);
			//String date1 = Getsheet("TestExcel", 1, 2);
			enterText(date, "20/06/2022");

			WebElement checkout = findElementById("datepick_out");
			clear(checkout);
			//String getsheet2 = Getsheet("TestExcel", 1, 2);
			enterText(checkout, "21/06/2022");

			WebElement adult = findElementById("adult_room");
			Getsheet("sheet02", 1, 5);
			selectindex(adult, 3);

			WebElement child = findElementById("child_room");
			String childroom = Getsheet("sheet02", 1, 5);
			selectVisible(child, childroom);

			WebElement submit = findElementById("Submit");
			Click(submit);
			
			WebElement xpath = xpath("//td[text()='Select Hotel ']");
			String txt = getText(xpath);
			System.out.println(txt);
			Assert.assertEquals("Verify username: ", "Select Hotel", txt);
			boolean than01 = txt.contains("Select Hotel");
			Assert.assertTrue(than01);
			System.out.println(than01);

			WebElement radio = findElementById("radiobutton_0");
			Click(radio);

			WebElement contine = findElementById("continue");
			Click(contine);
			
			WebElement bookHotel = xpath("//td[text()='Book A Hotel ']");
			String book = getText(bookHotel);
			System.out.println(book);
			Assert.assertEquals("Verify username: ", "Book A Hotel", book);
			boolean than2 = book.contains("Book A Hotel");
			Assert.assertTrue(than2);
			System.out.println(than2);
			
			WebElement firstname = findElementById("first_name");
			String firstnam = Getsheet("TestExcel", 1, 3);
			enterText(firstname, firstnam);

			WebElement ls = findElementById("last_name");
			String lastname = Getsheet("TestExcel", 1, 4);
			enterText(ls, lastname);

			WebElement add = findElementById("address");
			String address = Getsheet("TestExcel", 1, 5);
			enterText(add, address);

			WebElement cc = findElementById("cc_num");
			String credit = Getsheet("TestExcel", 1, 6);
			enterText(cc, credit);

			WebElement card = findElementById("cc_type");
			String cardtype = Getsheet("sheet02", 1, 14);
			selectVisible(card, cardtype);

			WebElement dt = findElementById("cc_exp_month");
			String month = Getsheet("sheet02", 1, 15);
			selectVisible(dt, month);

			WebElement year = findElementById("cc_exp_year");
			String expyear = Getsheet("sheet02", 1, 16);
			selectVisible(year, expyear);

			WebElement cvv = findElementById("cc_cvv");
			String cv = Getsheet("TestExcel", 1, 7);
			enterText(cvv, cv);

			WebElement ok = findElementById("book_now");
			Click(ok);

			Thread.sleep(5000);
			WebElement confirmation = xpath("//td[text()='Booking Confirmation ']");
			String confirm = getText(confirmation);
			System.out.println(confirm);
			Assert.assertEquals("Verify username: ", "Booking Confirmation", confirm);
			boolean than3 = confirm.contains("Booking Confirmation");
			Assert.assertTrue(than3);
			System.out.println(than3);
			
			WebElement insert = findElementById("order_no");
			String text = insert.getAttribute("value");
		//	System.out.println(text);
			insertdata("TestExcel", 1, 9, text);
			
			

			

		}

		
		
	}


