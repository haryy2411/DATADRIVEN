package pageObjectModel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import maven.ReusableMethod;

public class Orderid extends ReusableMethod{
	
	public Orderid() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_no")
	private WebElement orderNo;

	public WebElement getOrderNo() {
		return orderNo;
	}
	
	public void orderIdno() throws IOException {
	threadwait();
	String text = attributeValue(getOrderNo(), "value");
	insertdata("sheet02", 1, 18, text);

	}

}
