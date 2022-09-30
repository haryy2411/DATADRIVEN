package com.blazeflight;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailsPOM extends ReusableMethod {

	public DetailsPOM() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "inputName")
	private WebElement txtUsername;

	@FindBy(id = "address")
	private WebElement txtaddress;

	@FindBy(id = "city")
	private WebElement city;

	@FindBy(id = "state")
	private WebElement state;

	@FindBy(id = "zipCode")
	private WebElement zipCode;

	@FindBy(id = "cardType")
	private WebElement cardType;

	@FindBy(id = "creditCardNumber")
	private WebElement creditCardNumber;

	@FindBy(id = "creditCardMonth")
	private WebElement creditCardMonth;

	@FindBy(id = "creditCardYear")
	private WebElement creditCardYear;

	@FindBy(id = "nameOnCard")
	private WebElement nameOnCard;

	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement clickbtn;
	
	public WebElement getClickbtn() {
		return clickbtn;
	}

	public void setClickbtn(WebElement clickbtn) {
		this.clickbtn = clickbtn;
	}

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public void setTxtUsername(WebElement txtUsername) {
		this.txtUsername = txtUsername;
	}

	public WebElement getTxtaddress() {
		return txtaddress;
	}

	public void setTxtaddress(WebElement txtaddress) {
		this.txtaddress = txtaddress;
	}

	public WebElement getCity() {
		return city;
	}

	public void setCity(WebElement city) {
		this.city = city;
	}

	public WebElement getState() {
		return state;
	}

	public void setState(WebElement state) {
		this.state = state;
	}

	public WebElement getZipCode() {
		return zipCode;
	}

	public void setZipCode(WebElement zipCode) {
		this.zipCode = zipCode;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public void setCardType(WebElement cardType) {
		this.cardType = cardType;
	}

	public WebElement getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(WebElement creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public WebElement getCreditCardMonth() {
		return creditCardMonth;
	}

	public void setCreditCardMonth(WebElement creditCardMonth) {
		this.creditCardMonth = creditCardMonth;
	}

	public WebElement getCreditCardYear() {
		return creditCardYear;
	}

	public void setCreditCardYear(WebElement creditCardYear) {
		this.creditCardYear = creditCardYear;
	}

	public WebElement getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(WebElement nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	
	public void details(String txtUsername, String txtaddress, String city, String state, String zipCode, String cardType,
			String creditCardNumber, String creditCardMonth, String creditCardYear, String nameOnCard) {
		enterText(getTxtUsername(), txtUsername);
		enterText(getTxtaddress(), txtaddress);
		enterText(getCity(), city);
		enterText(getState(), state);
		enterText(getZipCode(), zipCode);
		selectVisible(getCardType(), cardType);
		enterText(getCreditCardNumber(), creditCardNumber);
		enterText(getCreditCardMonth(), creditCardMonth);
		enterText(getCreditCardYear(), creditCardYear);
		enterText(getNameOnCard(), nameOnCard);
		Click(getClickbtn());
	}

}
