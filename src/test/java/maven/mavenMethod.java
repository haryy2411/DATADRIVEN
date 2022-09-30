package maven;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class mavenMethod {



	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		ReusableMethod r = new ReusableMethod();
		r.getdriver();
		r.url("https://adactinhotelapp.com/index.php");
		WebElement txtuser = r.findElementById("username");
		String getsheet = r.Getsheet("TestExcel", 1, 0);
		r.enterText(txtuser, getsheet);

		WebElement txtpassword = r.findElementById("password");
		String sheet2 = r.Getsheet("TestExcel", 1, 1);
		r.enterText(txtpassword, sheet2);

		WebElement btnlogin = r.findElementById("login");
		r.Click(btnlogin);

		r.threadwait();

		WebElement sel = r.findElementById("location");
		r.selectVisible(sel, "Sydney");

		WebElement location = r.findElementById("hotels");
		r.selectVisible(location, "Hotel Cornice");

		WebElement room = r.findElementById("room_type");
		r.selectVisible(room, "Double");

		WebElement date = r.findElementById("datepick_in");
		r.clear(date);
		//String date1 = r.Getsheet("TestExcel", 1, 2);
		r.enterText(date, "20/06/2022");

		WebElement checkout = r.findElementById("datepick_out");
		r.clear(checkout);
		//String getsheet2 = r.Getsheet("TestExcel", 1, 2);
		r.enterText(checkout, "21/06/2022");

		WebElement adult = r.findElementById("adult_room");
		r.selectindex(adult, 3);

		WebElement child = r.findElementById("child_room");
		r.selectindex(child, 2);

		WebElement submit = r.findElementById("Submit");
		r.Click(submit);

		WebElement radio = r.findElementById("radiobutton_0");
		r.Click(radio);

		WebElement contine = r.findElementById("continue");
		r.Click(contine);

		WebElement firstname = r.findElementById("first_name");
		String firstnam = r.Getsheet("TestExcel", 1, 3);
		r.enterText(firstname, firstnam);

		WebElement ls = r.findElementById("last_name");
		String lastname = r.Getsheet("TestExcel", 1, 4);
		r.enterText(ls, lastname);

		WebElement add = r.findElementById("address");
		String address = r.Getsheet("TestExcel", 1, 5);
		r.enterText(add, address);

		WebElement cc = r.findElementById("cc_num");
		String credit = r.Getsheet("TestExcel", 1, 6);
		r.enterText(cc, credit);

		WebElement card = r.findElementById("cc_type");
		r.selectVisible(card, "Master Card");

		WebElement dt = r.findElementById("cc_exp_month");
		r.selectVisible(dt, "February");

		WebElement year = r.findElementById("cc_exp_year");
		r.selectVisible(year, "2015");

		WebElement cvv = r.findElementById("cc_cvv");
		String cv = r.Getsheet("TestExcel", 1, 7);
		r.enterText(cvv, cv);

		WebElement ok = r.findElementById("book_now");
		r.Click(ok);

		Thread.sleep(5000);

		WebElement insert = r.findElementById("order_no");
		String text = insert.getAttribute("value");
		System.out.println(text);
		r.insertdata("TestExcel", 1, 9, text);

		//r.close();
	}

}
