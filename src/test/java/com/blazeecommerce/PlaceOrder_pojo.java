package com.blazeecommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.blazeflight.ReusableMethod;

public class PlaceOrder_pojo extends ReusableMethod {

	public PlaceOrder_pojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "name")
	private WebElement txtname;

	@FindBy(id = "country")
	private WebElement txtcountry;

	@FindBy(id = "city")
	private WebElement txtcity;

	@FindBy(id = "card")
	private WebElement txtcard;

	@FindBy(id = "month")
	private WebElement month;

	@FindBy(id = "year")
	private WebElement year;

	@FindBy(xpath = "//button[text()='Purchase']")
	private WebElement btnpurchase;

	public WebElement getTxtname() {
		return txtname;
	}

	public void setTxtname(WebElement txtname) {
		this.txtname = txtname;
	}

	public WebElement getTxtcountry() {
		return txtcountry;
	}

	public void setTxtcountry(WebElement txtcountry) {
		this.txtcountry = txtcountry;
	}

	public WebElement getTxtcity() {
		return txtcity;
	}

	public void setTxtcity(WebElement txtcity) {
		this.txtcity = txtcity;
	}

	public WebElement getTxtcard() {
		return txtcard;
	}

	public void setTxtcard(WebElement txtcard) {
		this.txtcard = txtcard;
	}

	public WebElement getMonth() {
		return month;
	}

	public void setMonth(WebElement month) {
		this.month = month;
	}

	public WebElement getYear() {
		return year;
	}

	public void setYear(WebElement year) {
		this.year = year;
	}

	public WebElement getBtnpurchase() {
		return btnpurchase;
	}

	public void setBtnpurchase(WebElement btnpurchase) {
		this.btnpurchase = btnpurchase;
	}

	public void PlaceOrder(String txtname, String txtcountry, String txtcity, String txtcard, String month,
			String year) {

		enterText(getTxtname(), txtname);
		enterText(getTxtcountry(), txtcountry);
		enterText(getTxtcity(), txtcity);
		enterText(getTxtcard(), txtcard);
		enterText(getMonth(), month);
		enterText(getYear(), year);
		Click(btnpurchase);

	}
}
