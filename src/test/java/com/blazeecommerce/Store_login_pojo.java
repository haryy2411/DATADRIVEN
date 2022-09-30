package com.blazeecommerce;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.blazeflight.ReusableMethod;

public class Store_login_pojo extends ReusableMethod {

	public Store_login_pojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "login2")
	private WebElement loginbtn;

	@FindBy(id = "loginusername")
	private WebElement txtusername;

	@FindBy(id = "loginpassword")
	private WebElement txtpass;

	@FindBy(xpath = "//button[@onclick='logIn()']")
	private WebElement btnclick;

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public void setLoginbtn(WebElement loginbtn) {
		this.loginbtn = loginbtn;
	}

	public WebElement getTxtusername() {
		return txtusername;
	}

	public void setTxtusername(WebElement txtusername) {
		this.txtusername = txtusername;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public void setTxtpass(WebElement txtpass) {
		this.txtpass = txtpass;
	}

	public WebElement getBtnclick() {
		return btnclick;
	}

	public void setBtnclick(WebElement btnclick) {
		this.btnclick = btnclick;
	}

	/**
	 * @param loginbtn
	 * @param txtusername
	 * @param txtpass
	 * @param btnclick
	 */
	public void Store_login(String txtusername, String txtpass) {
		Click(getLoginbtn());
		enterText(getTxtusername(), txtusername);
		enterText(getTxtpass(), txtpass);
		Click(getBtnclick());
		WebDriverWait driverwait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driverwait.until(ExpectedConditions.invisibilityOf(getBtnclick()));
	}

}
