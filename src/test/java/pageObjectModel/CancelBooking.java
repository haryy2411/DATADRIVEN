package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import maven.ReusableMethod;

public class CancelBooking extends ReusableMethod{
	
	public CancelBooking() {
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//a[text()='Booked Itinerary']")
private WebElement bookedItineary;

@FindBy(id="order_id_text")
private WebElement txtboxcancel;

@FindBy(id="search_hotel_id")
private WebElement gosearch;

@FindBy(id="check_all")
private WebElement Checkall;

@FindBy(name="cancelall")
private WebElement cancel;

public WebElement getBookedItineary() {
	return bookedItineary;
}

public WebElement getCancelBooking() {
	return txtboxcancel;
}

public WebElement getFilterid() {
	return gosearch;
}

public WebElement getCheckall() {
	return Checkall;
}

public WebElement getCancel() {
	return cancel;
}

public void bookingcancel(String orderTxt) {
	Click(getBookedItineary());
	threadwait();
	enterText(getCancelBooking(), orderTxt);
	threadwait();
	Click(getFilterid());
	Click(getCheckall());
	Click(getCancel());
	Alert();
}

}
