package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import maven.ReusableMethod;

public class BookHotel extends ReusableMethod {
	
	public BookHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="first_name")
	private WebElement txtFirstname;

	@FindBy(id="last_name")
	private WebElement txtLastname;

	@FindBy(id="address")
	private WebElement txtaddress;

	@FindBy(id="cc_num")
	private WebElement txtCardno;

	@FindBy(id="cc_type")
	private WebElement txtCardType;

	@FindBy(id="cc_exp_month")
	private WebElement txtCardmonth;

	@FindBy(id="cc_exp_year")
	private WebElement txtCardyear;

	@FindBy(id="cc_cvv")
	private WebElement txtCardCVV;

	@FindBy(id="book_now")
	private WebElement btnBook;

	public WebElement getTxtFirstname() {
		return txtFirstname;
	}

	public WebElement getTxtLastname() {
		return txtLastname;
	}

	public WebElement getTxtaddress() {
		return txtaddress;
	}

	public WebElement getTxtCardno() {
		return txtCardno;
	}

	public WebElement getTxtCardType() {
		return txtCardType;
	}

	public WebElement getTxtCardmonth() {
		return txtCardmonth;
	}

	public WebElement getTxtCardyear() {
		return txtCardyear;
	}

	public WebElement getTxtCardCVV() {
		return txtCardCVV;
	}

	public WebElement getBtnBook() {
		return btnBook;
	}

	public void BookPage(String firstName,String lastName,String address,String cardno,
			String cardType,String cardMonth,String cardyear,String cardCvv) {
		
enterText(getTxtFirstname(), firstName);
enterText(getTxtLastname(), lastName);
enterText(getTxtaddress(), address);
enterText(getTxtCardno(), cardno);
selectVisible(getTxtCardType(), cardType);
selectVisible(getTxtCardmonth(), cardMonth);
selectVisible(getTxtCardyear(), cardyear);
enterText(getTxtCardCVV(), cardCvv);
Click(getBtnBook());

	}
}
